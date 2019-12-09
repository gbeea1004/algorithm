package baekjoon.q2875;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Solution.solution(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }
}

class Solution {
    public static int solution(int N, int M, int K) {
        int countOfTeam = 0;
        int na = 0;

        int NCount = N / 2;
        if (NCount < M) {
            na += N % 2;
            na += M - NCount;
            countOfTeam = NCount;
        } else {
            na += N - (M * 2);
            countOfTeam = M;
        }

        int valueOfMinus = K - na;
        if (valueOfMinus <= 0) {
            return countOfTeam;
        }

        if (valueOfMinus % 3 != 0) {
            return countOfTeam - (valueOfMinus / 3 + 1);
        }
        return countOfTeam - (valueOfMinus / 3);
    }
}
