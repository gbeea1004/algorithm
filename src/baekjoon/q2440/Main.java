package baekjoon.q2440;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - i; j++) {
                bw.write("*");
            }
            bw.write(System.lineSeparator());
        }

        br.close();
        bw.close();
    }
}
