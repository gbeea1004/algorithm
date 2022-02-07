package baekjoon.q3184;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] mapSize = Arrays.stream(br.readLine().split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();

        String[][] map = new String[mapSize[0]][mapSize[1]];

        for (int i = 0; i < map.length; i++) {
            map[i] = br.readLine().split("");
        }

        bw.write(new Solution().solution(map));
        bw.newLine();

        bw.flush();

        bw.close();
        br.close();
    }
}

class Solution {

    // 상 하 좌 우
    private static final int[] X_DIR = {0, 0, -1, 1};
    private static final int[] Y_DIR = {-1, 1, 0, 0};
    private static final String SHEEP = "o";
    private static final String WOLF = "v";
    private static final String FENCE = "#";

    private String[][] map;
    private boolean[][] visited;
    private int liveSheepCount;
    private int liveWolfCount;

    public String solution(String[][] map) {
        this.map = map;
        visited = new boolean[map.length][map[0].length];
        liveSheepCount = findUnitCount(SHEEP);
        liveWolfCount = findUnitCount(WOLF);

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j].equals(SHEEP) || map[i][j].equals(WOLF)) {
                    bfs(i, j);
                }
            }
        }
        return liveSheepCount + " " + liveWolfCount;
    }

    public void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        int wolfCount = 0;
        int sheepCount = 0;

        queue.add(new Point(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            String unit = map[point.x][point.y];
            if (unit.equals(WOLF)) {
                wolfCount++;
            } else if (unit.equals(SHEEP)) {
                sheepCount++;
            }

            for (int i = 0; i < 4; i++) {
                int nextX = point.x + X_DIR[i];
                int nextY = point.y + Y_DIR[i];

                // 범위안에 있는가
                if (nextX < 0 || nextY < 0 || nextX >= map.length || nextY >= map[0].length) {
                    continue;
                }

                // 이미 방문했는가
                if (visited[nextX][nextY]) {
                    continue;
                }

                // 울타리인가
                if (map[nextX][nextY].equals(FENCE)) {
                    continue;
                }

                queue.add(new Point(nextX, nextY));
                visited[nextX][nextY] = true;
            }
        }

        if (wolfCount == 0 || sheepCount == 0) {
            return;
        }

        if (wolfCount >= sheepCount) {
            liveSheepCount -= sheepCount;
        } else {
            liveWolfCount -= wolfCount;
        }
    }

    private int findUnitCount(String unit) {
        return Arrays.stream(map)
                     .mapToInt(line -> (int) IntStream.range(0, map[0].length)
                                                      .filter(j -> line[j].equals(unit))
                                                      .count())
                     .sum();
    }

    class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
