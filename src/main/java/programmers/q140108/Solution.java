package programmers.q140108;

import java.util.Stack;

public class Solution {

    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(current);
                continue;
            }

            if (stack.peek() == current) {
                stack.push(current);
                continue;
            }

            stack.pop();
            if (stack.isEmpty()) {
                answer++;
            }
        }

        if (!stack.isEmpty()) {
            answer++;
        }

        return answer;
    }
}
