package baekjoon.q15552;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            bw.write(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum() + System.lineSeparator());
        }

        bw.close();
        br.close();
    }
}
