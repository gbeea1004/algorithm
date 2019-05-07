package sw_academy.q1926;

import java.io.*;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        final int THREE = 3;
        final int SIX = 6;
        final int NINE = 9;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int no = Integer.parseInt(br.readLine());
        for (int i = 1; i <= no; i++) {
            int[] currentNo = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();
            boolean containsOfRule = false;

            for (int indexValue : currentNo) {
                if (indexValue == THREE || indexValue == SIX || indexValue == NINE) {
                    bw.write("-");
                    containsOfRule = true;
                }
            }
            if (!containsOfRule) {
                bw.write(String.valueOf(i));
            }
            bw.write(" ");
        }
        bw.flush();
    }
}
