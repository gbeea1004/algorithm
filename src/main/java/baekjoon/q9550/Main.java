package baekjoon.q9550;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int[] firstLine = Arrays.stream(br.readLine().split(" "))
                                    .mapToInt(Integer::parseInt)
                                    .toArray();
            int[] candyCounts = Arrays.stream(br.readLine().split(" "))
                                      .mapToInt(Integer::parseInt)
                                      .toArray();

            bw.write(String.valueOf(new Solution().solution(firstLine[1], candyCounts)));
            bw.newLine();
        }

        bw.flush();

        bw.close();
        br.close();
    }
}

class Solution {

    public int solution(int k, int[] candyCounts) {
        int result = 0;

        for (int candyCount : candyCounts) {
            result += candyCount / k;
        }

        return result;
    }
}