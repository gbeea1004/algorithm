package baekjoon.q9094;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int[] numbers = Arrays.stream(br.readLine().split(" "))
                                  .mapToInt(Integer::parseInt)
                                  .toArray();

            bw.write(String.valueOf(solution(numbers[0], numbers[1])));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static int solution(int n, int m) {
        int count = 0;
        for (int a = 1; a < n - 1; a++) {
            for (int b = a + 1; b < n; b++) {
                Double result = calculator(a, b, m);
                if (result == result.intValue()) {
                    count++;
                }
            }
        }
        return count;
    }

    private static double calculator(double a, double b, double m) {
        return ((a * a) + (b * b) + m) / (a * b);
    }
}
