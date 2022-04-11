package baekjoon.q2752;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();

        Arrays.sort(numbers);

        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);

        scanner.close();
    }
}
