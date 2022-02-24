package baekjoon.q1032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        String[] fileNames = new String[n];

        for (int i = 0; i < n; i++) {
            fileNames[i] = br.readLine();
        }

        System.out.println(new Solution().solution(fileNames));

        br.close();
    }
}

class Solution {

    public String solution(String[] fileNames) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < fileNames[0].length(); i++) {
            char word = fileNames[0].charAt(i);

            boolean isSame = true;
            for (int j = 1; j < fileNames.length; j++) {
                if (word != fileNames[j].charAt(i)) {
                    sb.append("?");
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                sb.append(word);
            }
        }

        return sb.toString();
    }
}