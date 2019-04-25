package baekjoon.q1546;

import java.io.*;
import java.util.Formatter;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[] score = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = score[0];
        int total = score[0];
        for (int i = 1; i < score.length; i++) {
            total += score[i];
            if (max < score[i]) {
                max = score[i];
            }
        }

        double avg = total * 100.0 / max  / count;
        Formatter f = new Formatter();
        f.format("%.2f", avg);
        bw.write(String.valueOf(f));

        bw.flush();
    }
}