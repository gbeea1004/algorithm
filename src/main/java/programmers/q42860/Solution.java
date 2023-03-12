package programmers.q42860;

public class Solution {

    private static final int TOTAL_ALPHABET_COUNT = 26;
    private static final char START_ALPHABET = 'A';

    public int solution(String name) {
        int answer = 0;

        answer += addTopOrBottomCount(name);
        answer += getLeftOrRightCount(name);

        return answer;
    }

    private int addTopOrBottomCount(String name) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char alphabet = name.charAt(i);
            count += getTopOrBottomCount(alphabet);
        }
        return count;
    }

    private int getTopOrBottomCount(char alphabet) {
        int topCount = alphabet - START_ALPHABET;
        int bottomCount = TOTAL_ALPHABET_COUNT - (alphabet - START_ALPHABET);
        return Math.min(topCount, bottomCount);
    }

    private static int getLeftOrRightCount(String name) {
        int length = name.length();
        int move = length - 1;
        for (int i = 0; i < length; i++) {
            int nextIndex = i + 1;
            while (nextIndex < length && name.charAt(nextIndex) == START_ALPHABET) {
                nextIndex++;
            }

            // 오른쪽으로 갔다가 왼쪽으로
            move = Math.min(move, (i * 2) + length - nextIndex);
            // 왼쪽으로 갔다가 오른쪽으로
            move = Math.min(move, i + (length - nextIndex) * 2);
        }
        return move;
    }
}
