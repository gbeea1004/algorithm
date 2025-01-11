package programmers.q250125;

public class Solution {

    // 상 하 좌 우
    public static final int[] X_DIR = new int[]{-1, 1, 0, 0};
    public static final int[] Y_DIR = new int[]{0, 0, -1, 1};

    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        String findColor = board[h][w];
        for (int i = 0; i < 4; i++) {
            int nextX = h + X_DIR[i];
            int nextY = w + Y_DIR[i];

            if (nextX < 0 || nextY < 0 || nextX >= board.length || nextY >= board[0].length) {
                continue;
            }

            if (!board[nextX][nextY].equals(findColor)) {
                continue;
            }

            answer++;
        }

        return answer;
    }
}
