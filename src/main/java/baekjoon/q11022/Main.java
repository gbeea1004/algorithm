package baekjoon.q11022;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = scanner.nextInt();
        for (int i = 1; i <= count; i++) {
            final int A = scanner.nextInt();
            final int B = scanner.nextInt();
            bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
            bw.newLine();
        }
        bw.flush();
    }
}
