package baekjoon.q10798;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] texts = new String[5][];
        for (int i = 0; i < 5; i++) {
            texts[i] = scanner.nextLine().split("");
        }
        Solution solution = new Solution();
        System.out.println(solution.solution(texts));
        scanner.close();
    }
}

class Solution {
    public String solution(String[][] texts) {
        StringBuilder sb = new StringBuilder();
        int maxLen = texts[0].length;
        for (int i = 1; i < 5; i++) {
            if (maxLen < texts[i].length) {
                maxLen = texts[i].length;
            }
        }

        for (int i = 0; i < maxLen; i++) {
            for (int j = 0; j < 5; j++) {
                if (texts[j].length - 1 < i) {
                    continue;
                }
                sb.append(texts[j][i]);
            }
        }
        return sb.toString();
    }
}
