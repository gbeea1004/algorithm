package baekjoon.q2914;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int I = scanner.nextInt();
        System.out.println(new Solution().solution(A, I));
    }
}

class Solution {
    public int solution(int A, int I) {
        return A * (I - 1) + 1;
    }
}
