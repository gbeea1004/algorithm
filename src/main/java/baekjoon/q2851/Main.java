package baekjoon.q2851;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[10];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        System.out.println(new Solution().solution(scores));

        scanner.close();
    }
}

class Solution {

    public int solution(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];

            if (sum == 100) {
                break;
            }

            if (sum + score <= 100) {
                sum += score;
                continue;
            }

            int preDistFrom100 = 100 - sum;
            int nextDistFrom100 = sum + score - 100;

            sum = nextDistFrom100 > preDistFrom100 ? sum : sum + score;
            break;
        }

        return sum;
    }
}