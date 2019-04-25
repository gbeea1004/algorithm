package programmers.q12973;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("baabaa"));
    }
}

class Solution {
    private final int SUCCESS = 1;
    private final int FAIL = 0;

    public int solution(String s) {
        Stack stack = new Stack();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!stack.empty()) {
                if (stack.peek().equals(s.charAt(i))) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(s.charAt(i));
        }

        if (stack.empty()) {
            return SUCCESS;
        }
        return FAIL;
    }
}