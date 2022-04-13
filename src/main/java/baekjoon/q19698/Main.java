package baekjoon.q19698;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int l = scanner.nextInt();

        int enterCowCount = (w / l) * (h / l);
        System.out.println(Math.min(n, enterCowCount));

        scanner.close();
    }
}
