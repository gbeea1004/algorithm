package programmers.q12899;

public class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String[] numbers = new String[]{"4", "1", "2"};

        while (n > 0) {
            answer.insert(0, numbers[n % 3]);
            n = (n - 1) / 3;
        }

        return answer.toString();
    }
}
