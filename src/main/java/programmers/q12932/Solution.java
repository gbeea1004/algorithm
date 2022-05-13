package programmers.q12932;

public class Solution {

    public int[] solution(long n) {
        String text = String.valueOf(n);
        int[] answer = new int[text.length()];

        for (int i = 0; i < text.length(); i++) {
            answer[i] = text.charAt(text.length() - 1 - i) - '0';
        }

        return answer;
    }
}
