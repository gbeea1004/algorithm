package baekjoon.q7562;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            int l = scanner.nextInt();
            int[][] board = new int[l][l];

            board[scanner.nextInt()][scanner.nextInt()] = 1; // 출발점 : 1
            board[scanner.nextInt()][scanner.nextInt()] = -1; // 도착점 : -1

            result[i] = new Solution().solution(board);
        }

        for (int i : result) {
            System.out.println(i);
        }
    }
}

class Solution {
    private final int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    private final int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
    private boolean isFinish = false;

    public int solution(int[][] board) {
        Queue<Point> points = new LinkedList<>();
        int result = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    points.add(new Point(i, j));
                    break;
                }
            }
            if (!points.isEmpty()) {
                break;
            }
        }

        while (!points.isEmpty()) {
            Point point = points.poll();

            for (int i = 0; i < 8; i++) {
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];

                // 범위 체크
                if (nextX < 0 || nextY < 0 || nextX >= board.length || nextY >= board[0].length) {
                    continue;
                }

                if (board[nextX][nextY] == 0) {
                    board[nextX][nextY] = board[point.x][point.y] + 1;
                    points.add(new Point(nextX, nextY));
                }

                if (board[nextX][nextY] == -1) {
                    result = board[point.x][point.y];
                    isFinish = true;
                    break;
                }
            }

            if (isFinish) {
                break;
            }
        }

        return result;
    }

    class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}