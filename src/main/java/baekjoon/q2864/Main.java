package baekjoon.q2864;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        int small = Integer.parseInt(a.replaceAll("6", "5"))
                + Integer.parseInt(b.replaceAll("6", "5"));
        System.out.print(small + " ");

        int big = Integer.parseInt(a.replaceAll("5", "6"))
                + Integer.parseInt(b.replaceAll("5", "6"));
        System.out.print(big);
    }
}
