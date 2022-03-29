package programmers.q67256;

public class Solution {

    private static final String LEFT_HAND = "L";
    private static final String RIGHT_HAND = "R";
    private static final int[][] PHONE_NUMBERS = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {-1, 0, -2}
    };
    private int leftFingerPos;
    private int rightFingerPos;

    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        leftFingerPos = -1;
        rightFingerPos = -2;

        for (int number : numbers) {
            sb.append(pressNumber(number, hand));
        }

        return sb.toString();
    }

    private String pressNumber(int number, String hand) {
        // 왼쪽 손가락 사용
        if (number == 1 || number == 4 || number == 7) {
            leftFingerPos = number;
            return LEFT_HAND;
        }
        // 오른쪽 손가락 사용
        if (number == 3 || number == 6 || number == 9) {
            rightFingerPos = number;
            return RIGHT_HAND;
        }

        int[] numberIndex = findIndex(number);
        int leftFingerDir = getFingerDir(numberIndex, findIndex(leftFingerPos));
        int rightFingerDir = getFingerDir(numberIndex, findIndex(rightFingerPos));

        if (leftFingerDir == rightFingerDir) {
            if (hand.equals("left")) {
                leftFingerPos = number;
                return LEFT_HAND;
            }
            rightFingerPos = number;
            return RIGHT_HAND;
        }
        if (leftFingerDir < rightFingerDir) {
            leftFingerPos = number;
            return LEFT_HAND;
        }
        rightFingerPos = number;
        return RIGHT_HAND;
    }

    private int[] findIndex(int number) {
        int[] index = new int[2];
        for (int i = 0; i < PHONE_NUMBERS.length; i++) {
            for (int j = 0; j < PHONE_NUMBERS[0].length; j++) {
                if (PHONE_NUMBERS[i][j] == number) {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        throw new IllegalArgumentException("숫자를 찾을 수 없습니다.");
    }

    private int getFingerDir(int[] index, int[] targetIndex) {
        return Math.abs(index[0] - targetIndex[0]) + Math.abs(index[1] - targetIndex[1]);
    }
}
