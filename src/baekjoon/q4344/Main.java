package baekjoon.q4344;

import java.io.*;
import java.util.Formatter;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {

            int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            double avg = 0;
            for (int j = 1; j < input.length; j++) {
                avg += input[j];
            }
            avg /= input[0];

            double ratio = 0;
            for (int j = 1; j < input.length; j++) {
                if (input[j] > avg) {
                    ratio++;
                }
            }
            Formatter f = new Formatter();
            ratio = ratio * 100 / input[0];
            f.format("%.3f%s", ratio, "%");
            bw.write(String.valueOf(f));
            bw.newLine();
        }
        bw.flush();
    }
}
