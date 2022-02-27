package baekjoon.q9372;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<int[][]> flightSchedules = new ArrayList<>();
        final int T = Integer.parseInt(br.readLine());
        Queue<Integer> countries = new LinkedList<>();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            final int N = Integer.parseInt(st.nextToken());
            countries.add(N);
            final int M = Integer.parseInt(st.nextToken());
            int[][] flightSchedule = new int[M][2];

            for (int j = 0; j < M; j++) {
                flightSchedule[j] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }

            flightSchedules.add(flightSchedule);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> results = new Solution().solution(flightSchedules, countries);
        for (int result : results) {
            bw.write(String.valueOf(result));
            bw.newLine();
        }

        bw.flush();

        bw.close();
        br.close();
    }
}

class Solution {

    public List<Integer> solution(List<int[][]> flightSchedules, Queue<Integer> countries) {
        List<Integer> results = new ArrayList<>();

        for (Integer country : countries) {
            results.add(country - 1);
        }

        return results;
    }
}