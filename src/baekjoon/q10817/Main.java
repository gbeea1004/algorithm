package baekjoon.q10817;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] no = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(no);
        bw.write(String.valueOf(no[1]));

        bw.flush();
    }
}
