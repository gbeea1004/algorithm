package baekjoon.q19944;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        System.out.println(new Solution().solution(input[0], input[1]));
    }
}

class Solution {
    public String solution(int N, int M) {
        if (isNewbie(M)) {
            return "NEWBIE!";
        }

        if (isOldbie(M, N)) {
            return "OLDBIE!";
        }

        return "TLE!";
    }

    private boolean isNewbie(int grade) {
        return grade == 1 || grade == 2;
    }

    private boolean isOldbie(int grade, int N) {
        return grade <= N && !isNewbie(grade);
    }
}
