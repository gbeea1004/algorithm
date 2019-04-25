package programmers.q12951;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("1 2 3 "));
//        System.out.println(solution.solution("for the last week"));
    }
}

class Solution {
    public String solution(String s) {
        String[] input = s.split(" ", -1);
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            String text = input[i];
            if (text.length() > 0) {
                answer.append(text.substring(0, 1).toUpperCase());
                answer.append(text.substring(1).toLowerCase());
            }
            if (i == input.length - 1) {
                break;
            }
            answer.append(" ");
        }
        return answer.toString();
    }
}
