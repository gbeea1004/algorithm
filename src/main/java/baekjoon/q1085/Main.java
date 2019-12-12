package baekjoon.q1085;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        System.out.println(Math.min(Math.min(w - x, h - y), Math.min(x, y)));
    }
}
