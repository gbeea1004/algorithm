package programmers.q12980;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        while (n != 0) {
            // 순간이동
            if (n % 2 == 0) {
                n /= 2;
                continue;
            }
            // 점프
            n--;
            ans++;
        }
        return ans;
    }
}
