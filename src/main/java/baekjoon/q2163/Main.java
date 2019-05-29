package baekjoon.q2163;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] chocolateSize = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(Solution.solution(chocolateSize[0], chocolateSize[1])));

        bw.flush();
    }
}

class Solution {
    public static int solution(int N, int M) {
        return N * M - 1;
    }
}
