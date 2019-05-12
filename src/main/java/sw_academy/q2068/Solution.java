package main.java.sw_academy.q2068;

import java.io.*;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 1; i <= count; i++) {
            int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int max = input[0];
            for (int j = 1; j < input.length; j++) {
                if (max < input[j]) {
                    max = input[j];
                }
            }
            bw.write("#" + i + " " + max);
            bw.newLine();
        }

        bw.flush();
    }
}
