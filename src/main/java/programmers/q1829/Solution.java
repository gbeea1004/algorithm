package programmers.q1829;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    private static final int[] X_DIR = {0, 0, -1, 1};
    private static final int[] Y_DIR = {-1, 1, 0, 0};
    private boolean[][] visit;
    private int numberOfArea;
    private int maxSizeOfOneArea;

    public int[] solution(int m, int n, int[][] picture) {
        visit = new boolean[m][n];

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[0].length; j++) {
                if (visit[i][j] || picture[i][j] == 0) {
                    continue;
                }
                bfs(i, j, picture);
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    private void bfs(int x, int y, int[][] picture) {
        Queue<Point> points = new LinkedList<>();
        points.add(new Point(x, y, picture[x][y]));
        visit[x][y] = true;
        int sizeOfOneArea = 1;

        while (!points.isEmpty()) {
            Point point = points.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = point.getX() + X_DIR[i];
                int nextY = point.getY() + Y_DIR[i];

                // 범위를 벗어났는가
                if (nextX < 0 || nextY < 0 || nextX >= picture.length || nextY >= picture[0].length) {
                    continue;
                }

                // 이미 방문 했는가
                if (visit[nextX][nextY]) {
                    continue;
                }

                // 같은 영역인가
                if (!point.isSameColor(picture[nextX][nextY])) {
                    continue;
                }

                points.add(new Point(nextX, nextY, point.getColor()));
                visit[nextX][nextY] = true;
                sizeOfOneArea++;
            }
        }
        numberOfArea++;
        maxSizeOfOneArea = Math.max(maxSizeOfOneArea, sizeOfOneArea);
    }
}

class Point {

    private final int x;
    private final int y;
    private final int color;

    public Point(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public boolean isSameColor(int targetColor) {
        return color == targetColor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getColor() {
        return color;
    }
}
