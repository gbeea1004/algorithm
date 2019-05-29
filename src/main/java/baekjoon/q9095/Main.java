package baekjoon.q9095;

import java.io.*;

/*
 * 1을 나타내는 방법, 2를 나타내는 방법, 3을 나타내는 방법...
 * 1, 2, 3을 이용한 가지 수 이므로
 * f(n) = f(n-1) + f(n-2) + f(n-3)
 */
public class Main {
    public static void main(String[] args) throws IOException {
        final int ONE_NUMBER_OF_CASES = 1;
        final int TWO_NUMBER_OF_CASES = 2;
        final int THREE_NUMBER_OF_CASES = 4;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            int no = Integer.parseInt(br.readLine());
            if (no == 1) {
                bw.write(String.valueOf(ONE_NUMBER_OF_CASES));
                bw.newLine();
                continue;
            }
            if (no == 2) {
                bw.write(String.valueOf(TWO_NUMBER_OF_CASES));
                bw.newLine();
                continue;
            }
            if (no == 3) {
                bw.write(String.valueOf(THREE_NUMBER_OF_CASES));
                bw.newLine();
                continue;
            }

            int[] dp = new int[no + 1];
            dp[1] = ONE_NUMBER_OF_CASES; // 1을 이용한 가지 수 : 1가지
            dp[2] = TWO_NUMBER_OF_CASES; // 2를 이용한 가지 수 : 2가지
            dp[3] = THREE_NUMBER_OF_CASES; // 3을 이용한 가지 수 : 4가지

            for (int j = 4; j <= no; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }

            bw.write(String.valueOf(dp[no]));
            bw.newLine();
        }
        bw.flush();
    }
}