package sw_academy.q2070;

import java.io.*;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 1; i <= count; i++) {
            int[] no = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (no[0] > no[1]) {
                bw.write("#" + i + " >");
            } else if (no[0] == no[1]) {
                bw.write("#" + i + " =");
            } else {
                bw.write("#" + i + " <");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
