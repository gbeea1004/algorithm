package baekjoon.q9093;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] texts = br.readLine().split(" ");
            for (String text : texts) {
                bw.write(reverseText(text));
                bw.write(" ");
            }
            bw.newLine();
        }

        bw.flush();

        bw.close();
        br.close();
    }

    private static String reverseText(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }
}
