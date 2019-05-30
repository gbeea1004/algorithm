package baekjoon.q1793;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    private static final int SIZE = 250;

    public static void main(String[] args) {
        BigInteger[] dp = new BigInteger[SIZE + 1];
        dp[0] = new BigInteger("1"); // 공집합도 1개로 구분
        dp[1] = new BigInteger("1");
        dp[2] = new BigInteger("3");

        for (int i = 3; i <= SIZE; i++) {
            dp[i] = new BigInteger(String.valueOf(dp[i - 2].multiply(BigInteger.valueOf(2)).add(dp[i - 1])));
        }

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) { // 입력한 값이 int 아닐경우 false
            System.out.println(dp[scanner.nextInt()]);
        }
    }
}
