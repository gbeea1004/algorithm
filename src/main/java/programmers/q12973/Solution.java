package programmers.q12973;

import java.util.Stack;

public class Solution {

    private static final int TEXT_ALL_CLEAR = 1;
    private static final int NO_TARGET_REMOVED = 0;

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char alphabet = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == alphabet) {
                stack.pop();
                continue;
            }
            stack.push(alphabet);
        }
        return stack.isEmpty() ? TEXT_ALL_CLEAR : NO_TARGET_REMOVED;
    }
}
