package programmers.q12933;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 1123244567;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }
}

class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        String[] text = String.valueOf(n).split("");
        Arrays.sort(text);
        for (int i = text.length - 1; i >= 0; i--) {
            sb.append(text[i]);
        }
        return Long.parseLong(sb.toString());
    }
}