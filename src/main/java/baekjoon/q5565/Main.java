package baekjoon.q5565;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice = scanner.nextInt();
        for (int i = 0; i < 9; i++) {
            totalPrice -= scanner.nextInt();
        }
        System.out.println(totalPrice);
        scanner.close();
    }
}
