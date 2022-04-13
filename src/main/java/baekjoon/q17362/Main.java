package baekjoon.q17362;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[]{1, 2, 3, 4, 5, 4, 3, 2};

        if (n % 8 == 0) {
            System.out.println(numbers[numbers.length - 1]);
        } else {
            System.out.println(numbers[(n % 8) - 1]);
        }

        scanner.close();
    }
}
