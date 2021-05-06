package codesignal.intro24;

public class Solution {
    // 12시 방향부터 시계방향으로 12시 까지
    private static int[] DIR_X = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static int[] DIR_Y = {0, 1, 1, 1, 0, -1, -1, -1};

    int[][] minesweeper(boolean[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int count = 0;

                for (int k = 0; k < 8; k++) {
                    int nextX = DIR_X[k] + i;
                    int nextY = DIR_Y[k] + j;

                    if (nextX < 0 || nextY < 0 || nextX >= matrix.length || nextY >= matrix[0].length) {
                        continue;
                    }

                    if (matrix[nextX][nextY]) {
                        count++;
                    }
                }
                result[i][j] = count;
            }
        }
        return result;
    }
}
