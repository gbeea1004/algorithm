package baekjoon.q2420;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                               .mapToLong(Long::parseLong)
                               .toArray();

        System.out.println(Math.abs(numbers[0] - numbers[1]));

        scanner.close();
    }
}
