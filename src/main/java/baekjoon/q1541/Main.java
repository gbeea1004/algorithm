package baekjoon.q1541;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Solution.solution(scanner.next()));
    }
}

class Solution {
    public static int solution(String text) {
        String[] minus = text.split("-");
        int minusToSum = calculate(minus[0]);
        for (int i = 1; i < minus.length; i++) {
            minusToSum -= calculate(minus[i]);
        }
        return minusToSum;
    }

    private static int calculate(String text) {
        int[] numbers = Arrays.stream(text.split("\\+")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}

