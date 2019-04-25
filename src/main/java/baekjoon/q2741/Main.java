package baekjoon.q2741;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 1; i <= count; i++) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        bw.flush();
    }
}
