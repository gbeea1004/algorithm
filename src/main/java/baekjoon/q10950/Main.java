package baekjoon.q10950;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            bw.write(String.valueOf(scanner.nextInt() + scanner.nextInt()));
            bw.newLine();
        }
        bw.flush();
    }
}
