package baekjoon.q1427;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split("");
        Arrays.sort(input);
        Collections.reverse(Arrays.asList(input));

        for (String s : input) {
            bw.write(s);
        }
        bw.write("");

        br.close();
        bw.close();
    }
}
