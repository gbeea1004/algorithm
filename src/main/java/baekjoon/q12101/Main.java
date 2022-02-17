package baekjoon.q12101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(new Solution().solution(n, k));

        scanner.close();
    }
}

class Solution {

    public String solution(int n, int k) {
        List<List<String>> texts = new ArrayList<>();

        // 1
        texts.add(Arrays.asList("1"));

        // 2
        texts.add(Arrays.asList("1+1", "2"));

        // 3
        texts.add(Arrays.asList("1+1+1", "1+2", "2+1", "3"));

        for (int i = 3; i <= n; i++) {
            List<String> addText = new ArrayList<>();

            for (String text : texts.get(i - 1)) {
                addText.add("1+" + text);
            }

            for (String text : texts.get(i - 2)) {
                addText.add("2+" + text);
            }

            for (String text : texts.get(i - 3)) {
                addText.add("3+" + text);
            }

            texts.add(addText);
        }

        List<String> result = texts.get(n - 1);
        try {
            return result.get(k - 1);
        } catch (IndexOutOfBoundsException e) {
            return "-1";
        }
    }
}