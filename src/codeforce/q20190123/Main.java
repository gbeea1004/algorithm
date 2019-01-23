package codeforce.q20190123;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
//    time error
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = input[0]; j <= input[1]; j++) {
                a.add(j);
            }

            for (int j = input[2]; j <= input[3]; j++) {
                b.add(j);
            }
            int resultA = a.get(0);
            for (int j = 0; j < b.size(); j++) {
                if (b.get(j).equals(resultA)) {
                    b.remove(j);
                }
            }
            bw.write(resultA + " ");
            bw.write(b.get(0) + System.lineSeparator());

        }

        br.close();
        bw.close();
    }
}
