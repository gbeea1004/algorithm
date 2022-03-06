package baekjoon.q2225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(new Soltuion().solution(n, k));

        scanner.close();
    }
}

class Soltuion {

    public int solution(int n, int k) {
        int[][] result = new int[n + 1][k + 1];
        initRowToZero(result);
        initColumnToZero(result);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                result[i][j] = (result[i][j - 1] + result[i - 1][j]) % 1000000000;
            }
        }

        return result[n][k - 1];
    }

    private void initRowToZero(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            result[i][0] = 1;
        }
    }

    private void initColumnToZero(int[][] result) {
        for (int i = 1; i < result[0].length; i++) {
            result[0][i] = 1;
        }
    }
}
