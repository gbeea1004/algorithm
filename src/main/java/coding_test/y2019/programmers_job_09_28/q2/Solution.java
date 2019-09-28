package coding_test.y2019.programmers_job_09_28.q2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private final int SIZE_X = 8;
    private final int SIZE_Y = 8;
    private boolean[][] board;
    private final int[] DIR_X = {-1, -1, 1, 1};
    private final int[] DIR_Y = {-1, 1, 1, -1};

    public int solution(String[] bishops) {
        board = new boolean[SIZE_X][SIZE_Y];

        for (String bishop : bishops) {
            setBishop(new Point(SIZE_X - (bishop.charAt(1) - '0'), bishop.charAt(0) - 'A'));
        }

        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!board[i][j]) {
                    answer++;
                }
            }
        }
        return answer;
    }

    private void setBishop(Point point) {
        putInDirection(point, 0); // 왼쪽 위
        putInDirection(point, 1); // 오른쪽 위
        putInDirection(point, 2); // 오른쪽 아래
        putInDirection(point, 3); // 왼쪽 아래
    }

    private void putInDirection(Point point, int dir) {
        Queue<Point> points = new LinkedList<>();
        points.add(point);

        while (!points.isEmpty()) {
            Point currentPoint = points.poll();
            board[currentPoint.x][currentPoint.y] = true;

            int nextX = currentPoint.x + DIR_X[dir];
            int nextY = currentPoint.y + DIR_Y[dir];

            // 범위 체크
            if (nextX < 0 || nextY < 0 || nextX >= board.length || nextY >= board[0].length) {
                continue;
            }
            points.add(new Point(nextX, nextY));
        }
    }

    private class Point {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
