package programmers.q12943;

public class Solution {

    public int solution(long num) {
        int answer = 0;
        for (int i = 0; i < 500; i++) {
            if (num == 1) {
                return answer;
            }
            num = isEven(num) ? num / 2 : num * 3 + 1;
            answer++;
        }
        return -1;
    }

    private boolean isEven(long num) {
        return num % 2 == 0;
    }
}
