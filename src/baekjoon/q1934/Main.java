package baekjoon.q1934;

import java.io.*;
import java.util.Arrays;

public class Main {
    // 최소 공배수 구하기
    // 다시 풀어보기!!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            int[] no = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            final int GCD = gcd(no[0], no[1]);
            final int LCM = ((no[0] * no[1]) / GCD);
            bw.write(LCM + System.lineSeparator());
        }

        br.close();
        bw.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
