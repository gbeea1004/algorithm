package coding_test.y2019.zoom.q3;

public class Solution {
    private int[][] A;

    public int solution(int[][] A) {
        this.A = A;
        int checkMaxSize = Math.min(A.length, A[0].length);
        int currentSize = 2;
        int maxSize = 0;
        while (checkMaxSize >= currentSize) {
            for (int i = 0; i < A.length; i++) {
                // row 범위 체크
                if (i + currentSize - 1 >= A.length) {
                    break;
                }

                for (int j = 0; j < A[0].length; j++) {
                    // column 범위 체크
                    if (j + currentSize - 1 >= A[0].length) {
                        break;
                    }

                    if (isMagicSquare(i, j, i + currentSize, j + currentSize)) {
                        maxSize = currentSize;
                        break;
                    }
                }
                // 이미 해당 사이즈를 찾은경우 다음 사이즈 검사
                if (maxSize == currentSize) {
                    break;
                }
            }
            currentSize++;
        }
        return maxSize;
    }

    private boolean isMagicSquare(int startX, int startY, int toX, int toY) {
        int sum = 0;
        for (int i = startY; i < toY; i++) {
            sum += A[startX][i];
        }

        // row 검사
        for (int i = startX + 1; i < toX; i++) {
            int rowSum = 0;
            for (int j = startY; j < toY; j++) {
                rowSum += A[i][j];
            }
            if (sum != rowSum) {
                return false;
            }
        }

        // column 검사
        for (int i = startY; i < toY; i++) {
            int columnSum = 0;
            for (int j = startX; j < toX; j++) {
                columnSum += A[j][i];
            }
            if (sum != columnSum) {
                return false;
            }
        }

        // diagonal 검사
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        int leftIndex = startY;
        int rightIndex = toY - 1;
        for (int i = startX; i < toX; i++) {
            leftDiagonalSum += A[i][leftIndex++];
            rightDiagonalSum += A[i][rightIndex--];
        }
        if (sum != leftDiagonalSum && sum != rightDiagonalSum) {
            return false;
        }

        return true;
    }
}
