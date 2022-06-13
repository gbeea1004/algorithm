package programmers.q12934;

public class Solution {

    public long solution(long n) {
        Double sqrt = Math.sqrt(n);

        return sqrt == sqrt.intValue() ? (long) Math.pow(sqrt + 1, 2) : -1;
    }
}
