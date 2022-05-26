package programmers.q62048;

public class Solution {

    public long solution(int w, int h) {
        return (long) w * h - (w + h - gcd(w, h));
    }

    private long gcd(int a, int b) {
        int gcd = 0;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
