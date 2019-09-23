package baekjoon.q2217;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] ropes = new int[count];
        for (int i = 0; i < count; i++) {
            ropes[i] = scanner.nextInt();
        }
        System.out.print(new Solution().solution(ropes));
    }
}

class Solution {
    public int solution(int[] ropes) {
        Arrays.sort(ropes);
        int max = 0;
        for (int i = ropes.length - 1; i >= 0; i--) {
            max = Math.max(ropes[i] * (ropes.length - i), max);
        }
        return max;
    }
}
