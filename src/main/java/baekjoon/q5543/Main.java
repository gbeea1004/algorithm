package baekjoon.q5543;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Math.min(Math.min(scanner.nextInt(), scanner.nextInt()), scanner.nextInt())
                + Math.min(scanner.nextInt(), scanner.nextInt()) - 50);
        scanner.close();
    }
}
