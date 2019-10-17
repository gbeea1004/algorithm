package baekjoon.q2965;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(new Solution().solution(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }
}

class Solution {
    public int solution(int posKangarooA, int posKangarooB, int posKangarooC) {
        int[] kangaroos = new int[3];
        kangaroos[0] = posKangarooA;
        kangaroos[1] = posKangarooB;
        kangaroos[2] = posKangarooC;
        Arrays.sort(kangaroos);
        if (kangaroos[1] - kangaroos[0] > kangaroos[2] - kangaroos[1]) {
            return kangaroos[1] - kangaroos[0] - 1;
        }
        return kangaroos[2] - kangaroos[1] - 1;
    }
}
