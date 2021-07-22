package baekjoon.q2386;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String text = br.readLine();
            if (text.equals("#")) {
                break;
            }

            String[] texts = Arrays.stream(text.split(" ")).map(String::toLowerCase).toArray(String[]::new);
            String findWord = texts[0];
            int findWordCount = 0;
            for (int i = 1; i < texts.length; i++) {
                findWordCount += Arrays.stream(texts[i].split("")).filter(word -> word.equals(findWord)).count();
            }
            bw.write(findWord + " " + findWordCount);
            bw.newLine();
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
