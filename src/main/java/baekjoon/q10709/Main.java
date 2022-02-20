package baekjoon.q10709;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        final int H = Integer.parseInt(st.nextToken());
        final int W = Integer.parseInt(st.nextToken());

        String[][] area = new String[H][W];
        for (int i = 0; i < area.length; i++) {
            area[i] = br.readLine().split("");
        }

        int[][] result = new Solution().solution(area);
        for (int[] line : result) {
            for (int no : line) {
                bw.write(no + " ");
            }
            bw.newLine();
        }
        bw.newLine();

        bw.flush();

        bw.close();
        br.close();
    }
}

class Solution {

    private static final String CLOUD = "c";

    public int[][] solution(String[][] area) {
        int[][] result = new int[area.length][area[0].length];

        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[0].length; j++) {
                int second = 0;
                for (int k = j; k >= 0; k--) {
                    String spot = area[i][k];

                    if (spot.equals(CLOUD)) {
                        break;
                    }

                    if (k == 0) {
                        second = -1;
                        break;
                    }

                    second++;
                }
                result[i][j] = second;
            }
        }

        return result;
    }
}
