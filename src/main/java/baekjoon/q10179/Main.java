package baekjoon.q10179;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            double price = Double.parseDouble(br.readLine());
            bw.write("$" + String.format("%.2f", price - (price * 0.2)));
            bw.newLine();
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
