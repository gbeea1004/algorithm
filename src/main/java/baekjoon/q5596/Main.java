package baekjoon.q5596;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] minguk = Arrays.stream(scanner.nextLine().split(" "))
                             .mapToInt(Integer::parseInt)
                             .toArray();
        int[] manse = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        int mingukScore = Arrays.stream(minguk).sum();
        int manseScore = Arrays.stream(manse).sum();

        System.out.println(Math.max(mingukScore, manseScore));

        scanner.close();
    }
}
