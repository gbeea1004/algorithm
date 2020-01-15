package baekjoon.q1377;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count + 1];
        for (int i = 1; i <= count; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print(Solution.solution(numbers));
    }
}

class Solution {
    // numbers[0] 은 빈 값
    public static int solution(int[] numbers) {
        boolean change = false;
        for (int i = 1; i <= numbers.length + 1; i++) {
            change = false;
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    change = true;
                    swap(j, j + 1, numbers);
                }
            }
            if (!change) {
                return i;
            }
        }
        return 0;
    }

    private static void swap(int indexA, int indexB, int[] numbers) {
        int tmp = numbers[indexA];
        numbers[indexA] = numbers[indexB];
        numbers[indexB] = tmp;
    }
}
