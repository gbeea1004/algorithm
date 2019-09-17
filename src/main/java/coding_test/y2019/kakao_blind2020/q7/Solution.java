package coding_test.y2019.kakao_blind2020.q7;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    // 상하좌우
    private final int[] dirX = {0, 0, -1, 1};
    private final int[] dirY = {-1, 1, 0, 0};

    public int solution(int[][] board) {
        int answer = 0;
        Queue<Point> points = new LinkedList<>();
        points.add(new Point(0, 1)); // 시작지점
        while (!points.isEmpty()) {
            Point point = points.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = dirX[i] + point.x;
                int nextY = dirY[i] + point.y;

                // 범위 체크
                if (nextX < 1 || nextY < 1 || nextX >= board.length || nextY >= board.length) {
                    continue;
                }

            }
        }
        return answer;
    }

    private class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
