package baekjoon.q3003;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] findChess = Arrays.stream(scanner.nextLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();
        int[] chess = new int[]{1, 1, 2, 2, 2, 8};
        for (int i = 0; i < findChess.length; i++) {
            findChess[i] = chess[i] - findChess[i];
        }

        StringBuilder sb = new StringBuilder();
        for (int piece : findChess) {
            sb.append(piece)
              .append(" ");
        }
        System.out.println(sb.toString().trim());

        scanner.close();
    }
}
