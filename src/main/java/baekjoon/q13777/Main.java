package baekjoon.q13777;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    private static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int startNumber = 1;
        int endNumber = 50;

        int targetNumber = Integer.parseInt(scanner.nextLine());
        while (targetNumber != 0) {
            binarySearch(startNumber, endNumber, targetNumber);

            targetNumber = Integer.parseInt(scanner.nextLine());
        }

        bw.flush();
    }

    public static void binarySearch(int start, int end, int target) throws IOException {
        int middleNumber = (start + end) / 2;

        if (target == middleNumber) {
            bw.write(String.valueOf(middleNumber));
            bw.newLine();
            return;
        }

        bw.write(middleNumber + " ");

        if (target < middleNumber) {
            binarySearch(start, middleNumber - 1, target);
        } else {
            binarySearch(middleNumber + 1, end, target);
        }
    }
}
