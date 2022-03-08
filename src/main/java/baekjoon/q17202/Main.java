package baekjoon.q17202;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        System.out.println(new Solution().solution(a, b));

        scanner.close();
    }
}

class Solution {

    public String solution(String a, String b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
        }

        String result= sb.toString();
        while (result.length() != 2) {
            sb = new StringBuilder();
            for (int i = 0; i < result.length() - 1; i++) {
                int sum = (result.charAt(i) - '0') + (result.charAt(i + 1) - '0');
                sb.append(sum % 10);
            }
            result = sb.toString();
        }

        return result;
    }
}