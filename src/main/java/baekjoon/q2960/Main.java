package baekjoon.q2960;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int findByIndex = scanner.nextInt();
        boolean[] sosus = new boolean[no + 1];
        int count = 0;

        for (int i = 2; i < sosus.length; i++) {
            sosus[i] = true;
        }

        for (int i = 2; i < sosus.length; i++) {
            for (int j = i; j < sosus.length; j += i) {
                if (sosus[j]) {
                    sosus[j] = false;
                    count++;
                    if (count == findByIndex) {
                        System.out.println(j);
                        System.exit(0);
                    }
                }
            }
        }
        scanner.close();
    }
}
