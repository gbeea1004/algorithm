package baekjoon.q5597;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Boolean> students = new HashMap<>();
        for (int i = 1; i <= 30; i++) {
            students.put(i, false);
        }

        for (int i = 0; i < 28; i++) {
            students.put(scanner.nextInt(), true);
        }

        for (int i = 1; i <= students.size(); i++) {
            if (!students.get(i)) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
