package baekjoon.q15780;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        int[] multitap = Arrays.stream(scanner.nextLine().split(" "))
                               .mapToInt(Integer::parseInt)
                               .toArray();

        System.out.println(new Solution().solution(n, k, multitap));

        scanner.close();
    }
}

class Solution {

    private static final String SUCCESS = "YES";
    private static final String FAILED = "NO";

    public String solution(int n, int k, int[] multitap) {
        int tapCount = 0;
        for (int tap : multitap) {
            if (tap % 2 == 0) {
                tapCount += tap / 2;
                continue;
            }
            tapCount += tap / 2 + 1;
        }

        return n <= tapCount ? SUCCESS : FAILED;
    }
}
