package baekjoon.q2581;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int M = Integer.parseInt(br.readLine());
        final int N = Integer.parseInt(br.readLine());
        long sum = 0;

        List<Integer> result = sosu(M, N);

        if (result.isEmpty()) {
            bw.write("-1");
        } else {
            for (Integer i : result) {
                sum += i;
            }
            bw.write(sum + System.lineSeparator());
            bw.write(result.get(0) + "");
        }

        br.close();
        bw.close();
    }

    private static List<Integer> sosu(int m, int n) {
        List<Integer> sosus = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            boolean sosu = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    sosu = false;
                    break;
                }
            }
            if (sosu) {
                sosus.add(i);
            }
        }
        return sosus;
    }
}
