package baekjoon.q1789;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long MAX = scanner.nextLong();
        long sum = 0;
        long i = 1;
        while (true) {
            if (sum + i <= MAX) {
                sum += i++;
            } else {
                break;
            }
        }
        System.out.println(i - 1);
        scanner.close();
    }
}
