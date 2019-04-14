package baekjoon.q1546;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        double[] score = Stream.of(br.readLine().split(" ")).mapToDouble(Integer::parseInt).toArray();
        double max = score[0];
        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i] / max * 100;
        }

        bw.write(String.valueOf(sum / count));

        bw.flush();
    }
}
