package baekjoon.q1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'W') {
                    board[i][j] = true;
                } else {
                    board[i][j] = false;
                }
            }
        }

        System.out.println(new Solution().solution(N - 7, M - 7, board));
        br.close();
    }
}

class Solution {
    private final String WHITE = "W";
    private final String BLACK = "B";
    int result;

    public int solution(int row, int col, boolean[][] board) {
        result = 64; // 8 X 8 = 최대 64번 수정

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                calculateMinCount(i, j, board);
            }
        }
        return result;
    }

    private void calculateMinCount(int x, int y, boolean[][] board) {
        boolean startColor = board[x][y];
        int diffCount = 0;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (board[i][j] != startColor) {
                    diffCount++;
                }
                startColor = !startColor;
            }
            startColor = !startColor;
        }

        diffCount = Math.min(diffCount, 64 - diffCount);
        result = Math.min(result, diffCount);
    }
}
