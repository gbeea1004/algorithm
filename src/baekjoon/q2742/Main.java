package baekjoon.q2742;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = count; i > 0; i--) {
            bw.write(i + System.lineSeparator());
        }

        bw.flush();
    }
}
