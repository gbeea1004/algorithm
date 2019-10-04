package baekjoon.q2579;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int[] input = new int[count + 1];
        for (int i = 1; i < input.length; i++) {
            input[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print(new Solution().solution(input));
    }
}

class Solution {
    public int solution(int[] input) {
        int[] dp = new int[input.length];
        dp[1] = input[1];
        dp[2] = input[1] + input[2];
        for (int i = 3; i < dp.length; i++) {
            dp[i] = Math.max(input[i] + input[i - 1] + dp[i - 3], input[i] + dp[i - 2]);
        }
        return dp[dp.length - 1];
    }
}
