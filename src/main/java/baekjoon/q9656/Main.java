package baekjoon.q9656;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(new Solution().solution(n));

        scanner.close();
    }
}

class Solution {

    private static final String SANG_KEUN = "SK";
    private static final String CHANG_YOUNG = "CY";

    public String solution(int n) {
        return n % 2 == 0 ? SANG_KEUN : CHANG_YOUNG;
    }
}