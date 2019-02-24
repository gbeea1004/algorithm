package baekjoon.q2739;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int dan = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 9; i++) {
            bw.write(dan + " * " + i + " = " + (dan * i));
            bw.write(System.lineSeparator());
        }

        br.close();
        bw.close();
    }
}
