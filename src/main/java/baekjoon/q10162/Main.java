package baekjoon.q10162;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(new Solution().solution(scanner.nextInt()));
    }
}

class Solution {
    private static final int A = 300;
    private static final int B = 60;
    private static final int C = 10;
    private int T;

    public String solution(int T) {
        StringBuilder sb = new StringBuilder();
        this.T = T;
        int minNumberA = calculateMinNumber(A);
        int minNumberB = calculateMinNumber(B);
        int minNumberC = calculateMinNumber(C);

        if (this.T != 0) {
            return "-1";
        }

        sb.append(minNumberA)
          .append(" ")
          .append(minNumberB)
          .append(" ")
          .append(minNumberC);

        return sb.toString();
    }

    private int calculateMinNumber(int buttonType) {
        int minNumber = T / buttonType;
        T -= (minNumber * buttonType);
        return minNumber;
    }
}
