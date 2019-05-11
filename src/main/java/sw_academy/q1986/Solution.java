package sw_academy.q1986;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 1; i <= count; i++) {
            int no = Integer.parseInt(br.readLine());
            int sum = 0;
            for (int j = 1; j <= no; j++) {
                // 짝수
                if (j % 2 == 0) {
                    sum -= j;
                    continue;
                }
                // 홀수
                sum += j;
            }

            bw.write("#" + i + " " + sum);
            bw.newLine();
        }

        bw.flush();
    }
}
