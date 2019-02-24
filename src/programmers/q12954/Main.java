package programmers.q12954;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long[] result = solution.solution(2, 5);
        System.out.println(Arrays.toString(result));
    }
}

class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        long no = x;
        for (int i = 0; i < n; i++) {
            answer[i] = x;
            x += no;
        }
        return answer;
    }
}