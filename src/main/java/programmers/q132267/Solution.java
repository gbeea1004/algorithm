package programmers.q132267;

public class Solution {

    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int receivedCoke = n / a * b;
            n = n - (a * (n / a)) + receivedCoke;
            answer += receivedCoke;
        }

        return answer;
    }
}
