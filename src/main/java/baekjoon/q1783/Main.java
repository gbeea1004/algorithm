package baekjoon.q1783;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(new Solution().solution(scanner.nextInt(), scanner.nextInt()));
    }
}

class Solution {
    public long solution(int n, int m) {
        if (n == 1) return 1;
        if (n == 2) return Math.min(4, (m + 1) / 2); // 2 ,3번은 최대 3회만 이동가능
        // 4회 이상
        if (m < 7) return Math.min(4, m);
        return m - 2;
    }
}
