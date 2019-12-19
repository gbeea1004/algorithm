package baekjoon.q10610;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print(Solution.solution(new Scanner(System.in).nextLine()));
    }
}

class Solution {
    public static String solution(String no) {
        // 30 배수의 조건 1 : 0이 하나 있어야 함
        if (!no.contains("0")) return "-1";

        // 30 배수의 조건 2 : 자리 수끼리의 합이 3의 배수여야 함
        if (isMultipleOfThree(no)) return "-1";

        int[] numbers = Arrays.stream(no.split("")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);

        StringBuilder sb = new StringBuilder();
        for (int i = numbers.length - 1; i >= 0; i--) {
            sb.append(numbers[i]);
        }
        return sb.toString();
    }

    private static boolean isMultipleOfThree(String no) {
        int total = 0;
        for (int i = 0; i < no.length(); i++) {
            total += no.charAt(i) - '0';
        }
        return total % 3 != 0;
    }
}
