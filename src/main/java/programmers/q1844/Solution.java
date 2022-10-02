package programmers.q1844;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    private static final int WALL = 0;
    private static final int NOT_ARRIVAL = -1;
    private static final int[] X_DIR = {0, 0, -1, 1};
    private static final int[] Y_DIR = {-1, 1, 0, 0};

    public int solution(int[][] maps) {
        final int n = maps.length - 1;
        final int m = maps[0].length - 1;
        Queue<Point> queue = new LinkedList<>();
        boolean[][] visit = new boolean[n + 1][m + 1];

        queue.add(new Point(n, m, 1));
        visit[n][m] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            if (point.isArrive()) {
                return point.getDir();
            }

            for (int i = 0; i < 4; i++) {
                int nextX = point.getX() + X_DIR[i];
                int nextY = point.getY() + Y_DIR[i];

                if (nextX < 0 || nextY < 0 || nextX >= n + 1 || nextY >= m + 1) {
                    continue;
                }

                if (maps[nextX][nextY] == WALL) {
                    continue;
                }

                if (visit[nextX][nextY]) {
                    continue;
                }

                queue.add(new Point(nextX, nextY, point.getDir() + 1));
                visit[nextX][nextY] = true;
            }
        }

        return NOT_ARRIVAL;
    }
}

class Point {

    private final int x;
    private final int y;
    private final int dir;

    public Point(int x, int y, int dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public boolean isArrive() {
        return x == 0 && y == 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDir() {
        return dir;
    }
}
