package baekjoon.q1120;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        System.out.print(new Solution().solution(A, B));
    }
}

class Solution {
    public int solution(String A, String B) {
        int result = A.length();
        int count = B.length() - A.length();
        for (int i = 0; i <= count; i++) {
            int diffCount = 0;
            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) != B.charAt(i + j)) {
                    diffCount++;
                }
            }
            result = Math.min(result, diffCount);
        }
        return result;
    }
}