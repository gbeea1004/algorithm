package baekjoon.q2490;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int A = 1;
        final int B = 2;
        final int C = 3;
        final int D = 4;
        final int E = 0;
        final int PLAY_COUNT = 3;

        for (int i = 0; i < PLAY_COUNT; i++) {
            int[] yuts = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int backCount = 0;
            for (int yut : yuts) {
                if (yut == 0) {
                    backCount++;
                }
            }
            switch (backCount) {
                case A : {
                    bw.write("A");
                    bw.newLine();
                    break;
                }
                case B : {
                    bw.write("B");
                    bw.newLine();
                    break;
                }
                case C : {
                    bw.write("C");
                    bw.newLine();
                    break;
                }
                case D : {
                    bw.write("D");
                    bw.newLine();
                    break;
                }
                case E : {
                    bw.write("E");
                    bw.newLine();
                    break;
                }
            }
        }
        bw.flush();
    }
}
