package baekjoon.q11726;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(new Solution().solution(scanner.nextInt()));
    }
}

class Solution {
    public int solution(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        return dp[n - 1];
    }
}