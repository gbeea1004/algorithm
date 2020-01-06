package programmers.q62048;

public class Solution {
    public long solution(long w, long h) {
        long gcd = gcd(w, h);
        // 최대공약수가 1일 경우
        if (gcd == 1) {
            return w * h - (w + h - 1);
        }
        // 최대공약수가 1보다 클 경우
        return w * h - (w + h - gcd);
    }

    private long gcd(long a, long b) {
        long r;
        long m = a;
        long n = b;
        while (n > 0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
}
