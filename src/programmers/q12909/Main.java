package programmers.q12909;

import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(")()("));
    }
}

class Solution {
    boolean solution(String s) {
        Stack stack = new Stack();
        try {
            for (int i = 0; i < s.length(); i++) {
                char current = s.charAt(i);
                if (current == '(') {
                    stack.push(current);
                } else if (current == ')') {
                    stack.pop();
                }
            }
        } catch (EmptyStackException e) {
            return false;
        }

        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
