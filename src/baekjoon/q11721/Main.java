package baekjoon.q11721;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            if (i != 0 && i % 10 == 0) {
                bw.newLine();
            }
            bw.write(String.valueOf(input.charAt(i)));
        }
        bw.flush();
    }
}
