package programmers.q64061;

import java.util.Stack;

public class Solution {
    private int countOfMissDoll;

    public int solution(int[][] board, int[] moves) {
        Stack<Integer> result = new Stack<>();
        countOfMissDoll = 0;
        for (int move : moves) {
            moveTong(board, result, move - 1);
        }

        return countOfMissDoll;
    }

    private void moveTong(int[][] board, Stack<Integer> result, int move) {
        for (int i = 0; i < board.length; i++) {
            int current = board[i][move];
            if (isPutDollInBasket(current)) {
                putDollInBasket(board, result, current, i, move);
                break;
            }
        }
    }

    private boolean isPutDollInBasket(int current) {
        return current != 0;
    }

    private void putDollInBasket(int[][] board, Stack<Integer> result, int current, int i, int move) {
        if (isSamePreDoll(current, result)) {
            result.pop();
            countOfMissDoll += 2;
            board[i][move] = 0;
            return;
        }
        result.push(current);
        board[i][move] = 0;
    }

    private boolean isSamePreDoll(int current, Stack<Integer> result) {
        return result.size() >= 1 && result.peek() == current;
    }
}
