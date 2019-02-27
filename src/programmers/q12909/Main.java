package programmers.q12909;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("()"));
    }
}

class Solution {
    boolean solution(String s) {
        if (s.charAt(0) == ')') {
            return false;
        }

        int result = 0;
        for (int i = 0; i < s.length(); i++) {

            if (result < 0) {
                return false;
            }
            char current = s.charAt(i);
            if (current == '(') {
                result++;
            } else if (current == ')') {
                result--;
            }
        }
        if (result == 0) {
            return true;
        } else {
            return false;
        }
    }
}
