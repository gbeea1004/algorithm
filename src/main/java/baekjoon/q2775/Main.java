package baekjoon.q2775;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[][] apartment = new int[15][14];
        for (int i = 0; i < 14; i++) {
            apartment[0][i] = i + 1;
        }
        for (int i = 1; i < apartment.length; i++) {
            int sum = 0;
            for (int j = 0; j < apartment[i].length; j++) {
                sum += apartment[i - 1][j];
                apartment[i][j] = sum;
            }
        }

        for (int i = 0; i < count; i++) {
            int k = Integer.parseInt(br.readLine()); // 층
            int n = Integer.parseInt(br.readLine()); // 호

            bw.write(apartment[k][n - 1] + "");
            bw.write(System.lineSeparator());;
        }

        br.close();
        bw.close();
    }
}
