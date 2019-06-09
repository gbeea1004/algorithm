package baekjoon.q4948;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 에라토스테네스의 체
        boolean[] sosus = new boolean[123456 * 2 + 1];
        sosus[0] = false;
        sosus[1] = false;
        for (int i = 2; i < sosus.length; i++) {
            sosus[i] = true;
        }

        for (int i = 2; (i * i) < sosus.length; i++) {
            if (sosus[i]) {
                for (int j = i * i; j < sosus.length; j += i) {
                    sosus[j] = false;
                }
            }
        }

        while (true) {
            int no = Integer.parseInt(br.readLine());
            if (no == 0) {
                break;
            }
            int countOfSosu = 0;
            int to = no * 2;
            for (int i = no + 1; i <= to; i++) {
                if (sosus[i]) {
                    countOfSosu++;
                }
            }
            bw.write(String.valueOf(countOfSosu));
            bw.newLine();
        }

        bw.flush();
    }
}
