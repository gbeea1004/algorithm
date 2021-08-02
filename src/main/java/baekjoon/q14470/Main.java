package baekjoon.q14470;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] temperatures = new int[5];

        for (int i = 0; i < 5; i++) {
            temperatures[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(new Solution().solution(temperatures));
    }
}

class Solution {
    public int solution(int[] temperatures) {
        int current = temperatures[0];

        if (current < 0) {
            int heatingTime = 0;
            heatingTime = Math.abs(current) * temperatures[2];
            heatingTime += temperatures[3];
            heatingTime += temperatures[4] * temperatures[1];
            return heatingTime;
        }

        return temperatures[4] * (temperatures[1] - current);
    }
}
