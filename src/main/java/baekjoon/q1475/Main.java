package baekjoon.q1475;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(""))
                              .mapToInt(Integer::parseInt)
                              .toArray();

        System.out.println(new Solution().solution(numbers));

        scanner.close();
    }
}

class Solution {
    private static final int SIX = 6;
    private static final int NINE = 9;

    public int solution(int[] numbers) {
        int[] sumNumbers = new int[10];

        for (int number : numbers) {
            if (number == NINE) {
                number = SIX;
            }
            sumNumbers[number]++;
        }

        sumNumbers[SIX] = sumNumbers[SIX] / 2 + sumNumbers[SIX] % 2;
        Arrays.sort(sumNumbers);

        return sumNumbers[sumNumbers.length - 1];
    }
}