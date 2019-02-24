package programmers.q12930;

// 주의 > split(" ") 로 하면 틀림. isEven을 통해 짝수인지 홀수인지 판별하여 문제를 푼다.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "A v    a";
        System.out.println(solution.solution(s));
    }
}

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] input = s.toCharArray();
        boolean isEven = true; // 짝수니?
        for (int i = 0; i < input.length; i++) {
            if (input[i] == ' ') {
                answer.append(" ");
                isEven = true;
            } else {
                if (isEven) {
                    answer.append(String.valueOf(input[i]).toUpperCase());
                } else {
                    answer.append(String.valueOf(input[i]).toLowerCase());
                }
                isEven = !isEven;
            }
        }
        return answer.toString();
    }
}
