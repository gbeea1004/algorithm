package sw_academy.q7510;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 1; i <= count; i++) {
            int no = Integer.parseInt(br.readLine());
            if (no == 1) {
                bw.write("#" + i + " " + 1);
                bw.newLine();
                continue;
            }

            int result = 1;
            boolean isEnd = false;
            for (int j = no / 2 + 1; j >= 1 ; j--) {
                int sum = 0;
                for (int k = j; k >= 1; k--) {
                    sum += k;
                    if (sum == no) {
                        if (k == 1) {
                            isEnd = true;
                        }
                        result++;
                        break;
                    }
                    if (sum > no) {
                        break;
                    }
                }

                if (isEnd) {
                    break;
                }
            }
            bw.write("#" + i + " " + result);
            bw.newLine();
        }
        bw.flush();
    }
}
