package programmers.q12905;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.solution(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}}));
//        System.out.println(solution.solution(new int[][]{{0, 0, 1, 1}, {1, 1, 1, 1}}));
        System.out.println(solution.solution(new int[][]{{1}, {1}}));
    }
}

class Solution {
    public int min(int a, int b, int c) {
        if (a >= b) {
            return b > c ? c : b;
        } else if (b >= c) {
            return a > c ? c : a;
        }
        return -1;
    }

    public int solution(int[][] board) {
        int max = 0;
        if (board[0].length == 1) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][0] == 1) {
                    return 1;
                }
            }
            return 0;
        }

        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    board[i][j] = min(board[i - 1][j - 1], board[i - 1][j], board[i][j - 1]) + 1;
                    if (max < board[i][j]) {
                        max = board[i][j];
                    }
                }
            }
        }
        return max * max;
    }
}
