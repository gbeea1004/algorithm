package baekjoon.q14502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Solution solution = new Solution();
        System.out.println(solution.solution(map));
    }
}

class Solution {
    private int[][] map;
    private int[][] copyMap;
    private int maxSafeCount;
    private int defaultSafeAreaCount;
    private final int[] dx = {-1, 1, 0, 0};
    private final int[] dy = {0, 0, -1, 1};

    public int solution(int[][] map) {
        this.map = map;
        defaultSafeAreaCount = (int) Arrays.stream(map)
                .flatMapToInt(Arrays::stream)
                .filter(e -> e == 0 || e == 2)
                .count();

        makeWall(0, 0);
        return maxSafeCount;
    }

    private void makeWall(int next, int count) {
        // 벽 3개면 바이러스 시작
        if (count == 3) {
            maxSafeCount = Math.max(maxSafeCount, defaultSafeAreaCount - countVirus() - 3);
            return;
        }


        // 벽 세우기
        // N * M 개 중 3개 뽑기 (조합)
        for (int i = next; i < map.length * map[0].length; i++) {
            int row = i / map[0].length;
            int col = i % map[0].length;

            if (map[row][col] == 0) {
                map[row][col] = 3; // 임시벽
                makeWall(i + 1, count + 1);
                map[row][col] = 0;
            }
        }
    }

    private int countVirus() {
        copyMap = new int[map.length][map[0].length];
        int count = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 2 && copyMap[i][j] == 0) {
                    count += spreadVirus(new Point(i, j));
                }
            }
        }
        return count;
    }

    // 바이러스 확장
    private int spreadVirus(Point point) {
        int count = 1;
        Queue<Point> points = new LinkedList<>();
        points.add(point);
        copyMap[point.x][point.y] = 1;

        while (!points.isEmpty()) {
            Point current = points.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                // 범위 체크
                if (nextX < 0 || nextY < 0 || nextX >= map.length || nextY >= map[0].length ||
                        copyMap[nextX][nextY] != 0 || map[nextX][nextY] != 0) {
                    continue;
                }

                copyMap[nextX][nextY] = 1;
                points.add(new Point(nextX, nextY));
                count++;
            }
        }
        return count;
    }

    class Point {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}