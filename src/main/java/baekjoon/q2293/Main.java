package baekjoon.q2293;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] no = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] values = new int[no[0]];
        for (int i = 0; i < no[0]; i++) {
            values[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(new Solution().solution(values, no[1]));
    }
}

class Solution {
    public int solution(int[] values, int k) {
        int[] dp = new int[k + 1]; // dp[1] => 1이 나올 수 있는 경우의 수
        dp[0] = 1;

        // values 값을 하나씩 계산하면서 누적
        for (int i = 0; i < values.length; i++) {
            for (int j = 1; j <= k; j++) {
                if (j - values[i] >= 0) {
                    dp[j] += dp[j - values[i]];
                }
            }
        }
        return dp[k];
    }
}
