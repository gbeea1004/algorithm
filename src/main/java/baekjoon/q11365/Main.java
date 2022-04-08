package baekjoon.q11365;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String text = br.readLine();
            if (text.equals("END")) {
                break;
            }

            for (int i = text.length() - 1; i >= 0; i--) {
                bw.write(text.charAt(i));
            }
            bw.newLine();
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
