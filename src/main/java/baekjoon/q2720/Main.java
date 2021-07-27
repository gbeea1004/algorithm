package baekjoon.q2720;

import java.io.*;

public class Main {
    public static final int[] CHANGES = {25, 10, 5, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int c = Integer.parseInt(br.readLine());
            for (int change : CHANGES) {
                bw.write((c / change) + " ");
                c %= change;
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}