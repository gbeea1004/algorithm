package programmers.q64061;

import java.util.Stack;

public class Solution {

    private static final int EMPTY = 0;
    private Stack<Integer> basket;
    private int answer;

    public int solution(int[][] board, int[] moves) {
        basket = new Stack<>();
        answer = 0;

        for (int move : moves) {
            playClawMachine(board, move - 1);
        }

        return answer;
    }

    private void playClawMachine(int[][] board, int move) {
        for (int i = 0; i < board.length; i++) {
            int holdObject = board[i][move];
            if (holdObject != EMPTY) {
                if (basket.isEmpty()) {
                    basket.push(holdObject);
                } else {
                    if (basket.peek().equals(holdObject)) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(holdObject);
                    }
                }

                board[i][move] = EMPTY;
                return;
            }
        }
    }
}
