package programmers.q42585;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("()(((()())(())()))(())"));
    }
}

class Solution {
    public int solution(String arrangement) {
        int answer = 0;
        Stack stack = new Stack();
        for (int i = 0; i < arrangement.length(); i++) {
            char current = arrangement.charAt(i);
            if (current == '(') {
                stack.push('(');
            } else if (current == ')' && arrangement.charAt(i - 1) == '(') {
                stack.pop();
                answer += stack.size();
            } else if (current == ')') {
                stack.pop();
                answer++;
            }
        }
        return answer;
    }
}
