package baekjoon.q2753;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int year = scanner.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
