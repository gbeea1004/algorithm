package codesignal.intro08;

import java.util.Arrays;

public class Solution {
    int matrixElementsSum(int[][] matrix) {
        boolean[][] visit = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0 && !visit[i][j]) {
                    if (i + 1 < matrix.length) {
                        for (int k = i + 1; k < matrix.length; k++) {
                            matrix[k][j] = 0;
                            visit[k][j] = true;
                        }
                    }
                } else {
                    visit[i][j] = true;
                }
            }
        }
        return Arrays.stream(matrix).flatMapToInt(array -> Arrays.stream(array).filter(e -> e != 0)).sum();
    }
}
