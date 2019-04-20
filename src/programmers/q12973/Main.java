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
        String[] text = s.split("");
        Stack stack = new Stack();
        stack.push(text[0]);
        for (int i = 1; i < text.length; i++) {
            if (!stack.empty()) {
                if (stack.peek().equals(text[i])) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(text[i]);
        }

        if (stack.empty()) {
            return SUCCESS;
        }
        return FAIL;
    }
}