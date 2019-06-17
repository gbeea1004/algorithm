package baekjoon.q10886;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int cute = 0;
        int notCute = 0;
        for (int i = 0; i < count; i++) {
            int answer = scanner.nextInt();
            if (answer == 0) {
                notCute++;
            } else {
                cute++;
            }
        }
        if (cute > notCute) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }
        scanner.close();
    }
}
