package baekjoon.q6603;

import java.util.Scanner;

public class Main {
    private static StringBuilder sb;
    private static int k;
    private static int count;
    private static int numbers[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while ((k = scanner.nextInt()) != 0) {
            numbers = new int[k]; // k = 6 ~ 13
            sb = new StringBuilder();

            for (int i = 0; i < k; i++) {
                numbers[i] = scanner.nextInt();
            }

            for (int i = 0; i < k - 5; i++) {
                count = 1;
                dfs(i, String.valueOf(numbers[i]));
            }
            System.out.println(sb.toString());
        }
    }

    private static void dfs(int index, String str) {
        if (count == 6) {
            sb.append(str + "\n");
        } else {
            for (int i = index + 1; i < k; i++) {
                count++;
                dfs(i, str + " " + numbers[i]);
            }
        }

        count--;
    }
}
