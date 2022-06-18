package programmers.q87389;

public class Solution {

    public int solution(int n) {
        for (int i = 2; i < 1000000; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        throw new IllegalArgumentException("나머지가 1이 될 수 없습니다.");
    }
}
