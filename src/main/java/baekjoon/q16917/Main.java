package baekjoon.q16917;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // 양념 치킨 가격
        int B = scanner.nextInt(); // 후라이드 치킨 가격
        int C = scanner.nextInt(); // 반반 치킨 가격
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        System.out.println(new Solution().solution(A, B, C, X, Y));

        scanner.close();
    }
}

class Solution {

    public int solution(int a, int b, int c, int x, int y) {
        int totalPriceOne = a * x + b * y;
        int priceOfAOneBOne = c * 2;

        if (x > y) {
            return Math.min(Math.min(totalPriceOne, a * (x - y) + (y * priceOfAOneBOne)), x * priceOfAOneBOne);
        }
        if (x < y) {
            return Math.min(Math.min(totalPriceOne, b * (y - x) + (x * priceOfAOneBOne)), y * priceOfAOneBOne);
        }
        return Math.min(totalPriceOne, x * priceOfAOneBOne);
    }
}