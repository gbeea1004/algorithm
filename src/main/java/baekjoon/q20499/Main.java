package baekjoon.q20499;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] score = Arrays.stream(scanner.nextLine().split("/"))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        if (score[0] + score[2] < score[1] || score[1] == 0) {
            System.out.println("hasu");
        } else {
            System.out.println("gosu");
        }

        scanner.close();
    }
}
