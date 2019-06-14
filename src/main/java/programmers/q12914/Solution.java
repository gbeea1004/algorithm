package programmers.q12914;

public class Solution {
    public long solution(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int[] dir = new int[n + 1];
        dir[1] = 1;
        dir[2] = 2;

        for (int i = 3; i < dir.length; i++) {
            dir[i] = (dir[i - 1] + dir[i - 2]) % 1234567;
        }
        return dir[n];
    }
}
