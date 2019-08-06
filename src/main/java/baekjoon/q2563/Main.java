package baekjoon.q2563;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[][] paper = new int[100][100];

        int result = 0;
        for (int i = 0; i < count; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (paper[j][k] != 1) {
                        paper[j][k] = 1;
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
