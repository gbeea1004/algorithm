package baekjoon.q10871;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] no = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < input[0]; i++) {
            if (input[1] > no[i]) {
                bw.write(no[i] + " ");
            }
        }

        bw.flush();
    }
}
