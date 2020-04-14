package baekjoon.q4806;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            result++;
        }
        System.out.print(result);
        scanner.close();
    }
}
