package baekjoon.q1065;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(Solution.solution(scanner.nextInt()));
    }
}

class Solution {
    public static int solution(int n) {
        if (1 <= n && n < 100) return n;
        return getHansuCountWhenOverOneHundred(n);
    }

    private static int getHansuCountWhenOverOneHundred(int n) {
        int result = 99;
        for (int i = 100; i <= n; i++) {
            char[] numbers = String.valueOf(i).toCharArray();
            int diff = numbers[1] - numbers[0];
            if (isArithmetic(numbers, diff)) result++;
        }
        return result;
    }

    private static boolean isArithmetic(char[] numbers, int diff) {
        boolean isArithmetic = true;
        for (int j = 2; j < numbers.length; j++) {
            if ((diff + numbers[j - 1]) != numbers[j]) {
                isArithmetic = false;
                break;
            }
        }
        return isArithmetic;
    }
}
