package codeforce.round535div3;

import java.io.*;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int a = input[0];
            int b = 0;
            for (int j = input[2]; j <= input[3]; j++) {
                if (a != j) {
                    b = j;
                    break;
                }
            }
            if (b == 0) {
                throw new Exception();
            }
            bw.write(a + " " + b + System.lineSeparator());
        }

        br.close();
        bw.close();
    }
}
