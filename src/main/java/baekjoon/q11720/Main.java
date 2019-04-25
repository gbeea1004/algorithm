package baekjoon.q11720;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int sum = 0;
        String[] input = br.readLine().split("");
        if (input.length != count) {
            throw new IndexOutOfBoundsException();
        }
        for (String i : input) {
            sum += Integer.parseInt(i);
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}
