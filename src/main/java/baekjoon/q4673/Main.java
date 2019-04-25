package baekjoon.q4673;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] isNotSelfNo = new boolean[10001];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= 10000; i++) {
            int d = getD(i);
            if (d <= 10000) {
                isNotSelfNo[d] = true;
            }
        }
        for (int i = 1; i < isNotSelfNo.length; i++) {
            if (!isNotSelfNo[i]) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        bw.flush();
    }

    private static int getD(int no) {
        int d = no;
        while (no > 0) {
            d += no % 10;
            no /= 10;
        }
        return d;
    }
}
