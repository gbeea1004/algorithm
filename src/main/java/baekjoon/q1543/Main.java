package baekjoon.q1543;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String document = scanner.nextLine();
        String searchWord = scanner.nextLine();

        System.out.println(new Solution().solution(document, searchWord));

        scanner.close();
    }
}

class Solution {

    public int solution(String document, String searchWord) {
        int searchSize = document.length() - searchWord.length();
        int result = 0;

        for (int i = 0; i <= searchSize; i++) {
            String word = document.substring(i, i + searchWord.length());
            if (word.equals(searchWord)) {
                result++;
                i = i + searchWord.length() - 1;
            }
        }

        return result;
    }
}