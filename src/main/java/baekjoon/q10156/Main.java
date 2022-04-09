package baekjoon.q10156;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scanner.nextLine(), " ");
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(new Solution().solution(k, n, m));

        scanner.close();
    }
}

class Solution {

    public int solution(int k, int n, int m) {
        int receivedMoney  = (k * n) - m;
        return Math.max(receivedMoney, 0);
    }
}
