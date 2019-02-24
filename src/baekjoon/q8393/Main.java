package baekjoon.q8393;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int no = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 1; i <= no; i++) {
            result += i;
        }
        bw.write(result + "");

        br.close();
        bw.close();
    }
}
