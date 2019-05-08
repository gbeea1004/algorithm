package sw_academy.q2007;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 1; i <= count; i++) {
            String input = br.readLine();
            for (int j = 1; j < input.length(); j++) { // 마디 최대 길이
                String check = input.substring(0, j);
                String next = input.substring(j, j + check.length());

                if (check.equals(next)) {
                    bw.write("#" + i + " " + check.length());
                    bw.newLine();
                    break;
                }
            }
        }
        bw.flush();
    }
}
