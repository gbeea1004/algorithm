package baekjoon.q2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        int result = (H * 60 + M) - 45;
        if (result < 0) {
            result = 24 * 60 + result;
        }
        H = result / 60;
        M = result % 60;
        System.out.print(H + " " + M);
    }
}
