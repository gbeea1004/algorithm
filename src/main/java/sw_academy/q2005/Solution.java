package sw_academy.q2005;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 1; i <= count; i++) {
            int size = Integer.parseInt(br.readLine());
            bw.write("#" + i);
            bw.newLine();

            int[][] triangle = new int[size][size];
            triangle[0][0] = 1;
            for (int j = 1; j < triangle.length; j++) {
                triangle[j][0] = 1;
                triangle[j][j] = 1;
            }

            for (int j = 2; j < triangle.length; j++) {
                for (int k = 1; k < j; k++) {
                    triangle[j][k] = triangle[j - 1][k - 1] + triangle[j - 1][k];
                }
            }

            for (int j = 0; j < triangle.length; j++) {
                for (int k = 0; k < triangle[0].length; k++) {
                    if (triangle[j][k] == 0) {
                        break;
                    }
                    bw.write(triangle[j][k] + " ");
                }
                bw.newLine();
            }
        }
        bw.flush();
    }
}
