package baekjoon.q1297;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int h = scanner.nextInt();
        int w = scanner.nextInt();

        double res = Math.sqrt(Math.pow(d, 2) / (Math.pow(h, 2) + Math.pow(w, 2)));
        System.out.println(((int) Math.floor(res * h)) + " " + ((int) Math.floor(res * w)));

        scanner.close();
    }
}
