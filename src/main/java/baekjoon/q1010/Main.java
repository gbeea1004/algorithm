package baekjoon.q1010;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        Solution solution = new Solution();

        for (int i = 0; i < t; i++) {
            int[] sites = Arrays.stream(br.readLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();
            // 조합 : M 개 중 N 개를 뽑기
            bw.write(String.valueOf(solution.solution(sites[1], sites[0])));
            bw.newLine();
        }

        bw.flush();

        bw.close();
        br.close();
    }
}

class Solution {

    private int[][] dp = new int[30][30];

    public int solution(int n, int r) {
        if (dp[n][r] > 0) {
            return dp[n][r];
        }

        if (n == r || r == 0) {
            return dp[n][r] = 1;
        }

        dp[n][r] = solution(n - 1, r - 1) + solution(n - 1, r);
        return dp[n][r];
    }
}
