package baekjoon.q9655;

import java.util.Scanner;

public class Main {
    private static final String SANG_KEUN_WIN = "SK";
    private static final String CHANG_YOUNG_WIN = "CY";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(n % 2 == 0 ? CHANG_YOUNG_WIN : SANG_KEUN_WIN);

        scanner.close();
    }
}
