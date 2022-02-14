package baekjoon.q1743;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            map[x][y] = 1;
        }

        System.out.println(new Solution().solution(map));

        br.close();
    }
}

class Solution {

    // 상, 하, 좌, 우
    private static final int[] X_DIR = {-1, 1, 0, 0};
    private static final int[] Y_DIR = {0, 0, -1, 1};
    private int[][] map;
    private boolean[][] visit;
    private int result;

    public int solution(int[][] map) {
        result = 0;
        this.map = map;
        visit = new boolean[map.length][map[0].length];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 1 && !visit[i][j]) {
                    bfs(i, j);
                }
            }
        }

        return result;
    }

    private void bfs(int x, int y) {
        Queue<Point> points = new LinkedList<>();
        points.add(new Point(x, y));
        visit[x][y] = true;
        int foodWasteSize = 1;

        while (!points.isEmpty()) {
            Point point = points.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = X_DIR[i] + point.x;
                int nextY = Y_DIR[i] + point.y;

                if (nextX < 0 || nextY < 0 || nextX >= map.length || nextY >= map[0].length) {
                    continue;
                }

                if (map[nextX][nextY] == 0) {
                    continue;
                }

                if (visit[nextX][nextY]) {
                    continue;
                }

                points.add(new Point(nextX, nextY));
                visit[nextX][nextY] = true;
                foodWasteSize++;
            }
        }

        result = Math.max(result, foodWasteSize);
    }

    class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
