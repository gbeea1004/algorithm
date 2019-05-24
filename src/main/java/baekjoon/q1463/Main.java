package baekjoon.q1463;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[] dp = new int[count + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= count; i++) {
            int current = dp[i - 1] + 1; // 해당 연산의 최솟값 =  이전 연산 최솟값 + 1
            if (i % 3 == 0) {
                dp[i] = Math.min(current, dp[i / 3] + 1);
                continue;
            }
            if (i % 2 == 0) {
                dp[i] = Math.min(current, dp[i / 2] + 1);
                continue;
            }
            dp[i] = current;
        }
        bw.write(String.valueOf(dp[count]));
        bw.flush();
    }
}
