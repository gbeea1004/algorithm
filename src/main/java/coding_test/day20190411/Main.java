package coding_test.day20190411;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("W 4s d2a3"));
    }
}

class Solution {
    public String solution(String text) {
        int sum = 0;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int current = text.charAt(i);
            // 공백
            if (current == 32) {
                continue;
            }
            // 숫자
            if (current >= 48 && current <= 57) {
                sum += current - 48;
                continue;
            }
            answer.append(String.valueOf((char) current).toUpperCase());
        }
        answer.append(sum);
        return answer.toString();
    }
}