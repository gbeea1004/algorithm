package baekjoon.q2460;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] station = new int[10][2];

        for (int i = 0; i < station.length; i++) {
            station[i] = Arrays.stream(br.readLine().split(" "))
                               .mapToInt(Integer::parseInt)
                               .toArray();
        }

        System.out.println(new Solution().solution(station));

        br.close();
    }
}

class Solution {

    public int solution(int[][] station) {
        int maxPersonCount = 0;
        int currentPersonCount = 0;

        for (int[] line : station) {
            int addPersonCount = line[1] - line[0];

            currentPersonCount += addPersonCount;
            maxPersonCount = Math.max(maxPersonCount, currentPersonCount);
        }

        return maxPersonCount;
    }
}


