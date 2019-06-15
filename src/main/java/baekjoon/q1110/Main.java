package baekjoon.q1110;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int copyInitNo = input;

        int count = 1;
        while (true) {
            int a = input / 10;
            int b = input % 10;
            int c = a + b;
            input = b * 10 + c % 10;

            if (copyInitNo == input) {
                break;
            }
            count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
