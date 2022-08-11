package baekjoon.q4153;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                                  .mapToInt(Integer::parseInt)
                                  .toArray();
            if (isFinish(numbers)) {
                break;
            }

            Arrays.sort(numbers);
            if (Math.pow(numbers[2], 2) == Math.pow(numbers[0], 2) + Math.pow(numbers[1], 2)) {
                bw.write("right");
            } else {
                bw.write("wrong");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    private static boolean isFinish(int[] numbers) {
        return numbers[0] == 0 && numbers[1] == 0 && numbers[2] == 0;
    }
}
