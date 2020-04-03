package baekjoon.q2193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(Solution.solution(scanner.nextInt()));
    }
}

class Solution {
    private static final long[] numbers = new long[90 + 1];
    static {
        numbers[1] = 1;
        numbers[2] = 1;
        numbers[3] = 2;

        for (int i = 4; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
    }

    public static long solution(int n) {
        return numbers[n];
    }
}
