package baekjoon.q10872;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int no = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(factorial(no)));

        bw.flush();
    }

    private static int factorial(int no) {
        int result = 1;
        for (int i = no; i > 1; i--) {
            result *= i;
        }
        return result;
    }
}
