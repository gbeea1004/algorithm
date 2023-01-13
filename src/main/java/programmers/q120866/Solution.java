package programmers.q120866;

public class Solution {

    public static final int BOOM = 1;
    public static final int SAFE_ZONE = 0;
    public static final int X = -1;
    public static final int[] X_DIR = new int[]{-1, 0, 1, 1, 1, 0, -1, -1}; // 완쪽 위부터 시계방향
    public static final int[] Y_DIR = new int[]{-1, -1, -1, 0, 1, 1, 1, 0};

    public int solution(int[][] board) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int area = board[i][j];
                if (area == BOOM) {
                    for (int k = 0; k < 8; k++) {
                        int nextX = X_DIR[k] + i;
                        int nextY = Y_DIR[k] + j;

                        if (nextX < 0 || nextY < 0 || nextX >= board.length || nextY >= board[0].length) {
                            continue;
                        }

                        if (board[nextX][nextY] == X) {
                            continue;
                        }

                        if (board[nextX][nextY] == BOOM) {
                            continue;
                        }

                        board[nextX][nextY] = X;
                    }
                }
            }
        }

        for (int[] row : board) {
            for (int area : row) {
                if (area == SAFE_ZONE) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
