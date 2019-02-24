package baekjoon.q13241;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] no = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        final long GCD = gcd(no[0], no[1]);
        final long LCM = (no[0] * no[1]) / GCD;
        bw.write(LCM + "");

        br.close();
        bw.close();
    }

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
