package programmers.q76502;

import java.util.Stack;

public class Solution {

    private static final char OPEN_LARGE_BRACKET = '[';
    private static final char OPEN_MIDDLE_BRACKET = '{';
    private static final char OPEN_SMALL_BRACKET = '(';
    private static final char CLOSE_LARGE_BRACKET = ']';
    private static final char CLOSE_MIDDLE_BRACKET = '}';
    private static final char CLOSE_SMALL_BRACKET = ')';

    public int solution(String s) {
        int result = 0;

        int count = s.length() - 1;
        for (int i = 0; i <= count; i++) {
            s = rotateText(s);

            Stack<Character> stack = new Stack<>();
            int length = s.length();
            for (int j = 0; j < length; j++) {
                char bracket = s.charAt(j);
                if (isOpenBracket(bracket)) {
                    stack.push(bracket);
                    continue;
                }

                if (stack.isEmpty()) {
                    addNotVerifyWord(stack);
                    break;
                }

                Character target = stack.pop();
                if (target == OPEN_LARGE_BRACKET && bracket != CLOSE_LARGE_BRACKET) {
                    addNotVerifyWord(stack);
                    break;
                }

                if (target == OPEN_MIDDLE_BRACKET && bracket != CLOSE_MIDDLE_BRACKET) {
                    addNotVerifyWord(stack);
                    break;
                }

                if (target == OPEN_SMALL_BRACKET && bracket != CLOSE_SMALL_BRACKET) {
                    addNotVerifyWord(stack);
                    break;
                }
            }

            if (stack.isEmpty()) {
                result++;
            }
        }

        return result;
    }

    private String rotateText(String s) {
        char firstAlphabet = s.charAt(0);
        s = s.substring(1) + firstAlphabet;
        return s;
    }

    private boolean isOpenBracket(char bracket) {
        return bracket == OPEN_LARGE_BRACKET || bracket == OPEN_MIDDLE_BRACKET || bracket == OPEN_SMALL_BRACKET;
    }

    private void addNotVerifyWord(Stack<Character> stack) {
        stack.push('X');
    }
}
