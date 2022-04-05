package baekjoon.q2475;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();

        int result = 0;
        for (int number : numbers) {
            result += number * number;
        }
        result %= 10;

        System.out.println(result);

        scanner.close();
    }
}
