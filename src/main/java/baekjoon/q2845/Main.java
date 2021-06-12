package baekjoon.q2845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int[] participantCount = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(new Solution().solution(L, P, participantCount));
    }
}

class Solution {
    public String solution(int L, int P, int[] participantCounts) {
        int participant = L * P;
        StringBuilder result = new StringBuilder();
        for (int participantCount : participantCounts) {
            result.append(participantCount - participant)
                  .append(" ");
        }

        return result.toString().trim();
    }
}
