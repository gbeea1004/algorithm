package baekjoon.q3085;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[][] board = new String[n][n];
        for (int i = 0; i < board.length; i++) {
            board[i] = br.readLine().split("");
        }

        bw.write(String.valueOf(new Solution().solution(board, n)));
        bw.newLine();

        bw.flush();

        bw.close();
        br.close();
    }
}

class Solution {
    // 상 하 좌 우
    private static final int[] X_DIR = {-1, 1, 0, 0};
    private static final int[] Y_DIR = {0, 0, -1, 1};
    private int maxCountOfCandyToEat;

    public int solution(String[][] board, int n) {
        maxCountOfCandyToEat = checkMaxCountOfCandyToEat(board, n);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                for (int k = 0; k < 4; k++) {
                    int nextX = X_DIR[k] + i;
                    int nextY = Y_DIR[k] + j;

                    // 범위 체크
                    if (nextX < 0 || nextY < 0 || nextX >= board.length || nextY >= board[0].length) {
                        continue;
                    }

                    swapColor(board, i, j, nextX, nextY);
                    maxCountOfCandyToEat = checkMaxCountOfCandyToEat(board, n);
                    swapColor(board, nextX, nextY, i, j);
                }
            }
        }

        return maxCountOfCandyToEat;
    }

    private void swapColor(String[][] board, int originX, int originY, int targetX, int targetY) {
        String temp = board[originX][originY];
        board[originX][originY] = board[targetX][targetY];
        board[targetX][targetY] = temp;
    }

    private int checkMaxCountOfCandyToEat(String[][] board, int n) {
        int maxCount = 0;

        // 행 체크
        for (int i = 0; i < n; i++) {
            int maxCountOfLineSameColor = 0;
            int countOfLineSameColor = 1;

            for (int j = 1; j < n; j++) {
                String preColor = board[i][j - 1];
                String currentColor = board[i][j];

                if (preColor.equals(currentColor)) {
                    countOfLineSameColor++;
                } else {
                    maxCountOfLineSameColor = Math.max(maxCountOfLineSameColor, countOfLineSameColor);
                    countOfLineSameColor = 1;
                }
            }
            maxCountOfLineSameColor = Math.max(maxCountOfLineSameColor, countOfLineSameColor);
            maxCount = Math.max(maxCount, maxCountOfLineSameColor);
        }

        // 열 체크
        for (int i = 0; i < n; i++) {
            int maxCountOfLineSameColor = 0;
            int countOfLineSameColor = 1;

            for (int j = 1; j < n; j++) {
                String preColor = board[j - 1][i];
                String currentColor = board[j][i];

                if (preColor.equals(currentColor)) {
                    countOfLineSameColor++;
                } else {
                    maxCountOfLineSameColor = Math.max(maxCountOfLineSameColor, countOfLineSameColor);
                    countOfLineSameColor = 1;
                }
            }
            maxCountOfLineSameColor = Math.max(maxCountOfLineSameColor, countOfLineSameColor);
            maxCount = Math.max(maxCount, maxCountOfLineSameColor);
        }

        return Math.max(maxCountOfCandyToEat, maxCount);
    }
}