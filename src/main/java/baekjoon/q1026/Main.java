package baekjoon.q1026;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Integer[] aNumbers = Arrays.stream(scanner.nextLine().split(" "))
                                   .mapToInt(Integer::parseInt)
                                   .boxed()
                                   .toArray(Integer[]::new);

        Integer[] bNumbers = Arrays.stream(scanner.nextLine().split(" "))
                                   .mapToInt(Integer::parseInt)
                                   .boxed()
                                   .toArray(Integer[]::new);

        System.out.println(new Solution().solution(aNumbers, bNumbers, n));

        scanner.close();
    }
}

class Solution {

    public int solution(Integer[] aNumbers, Integer[] bNumbers, int n) {
        int result = 0;
        Arrays.sort(aNumbers);
        Arrays.sort(bNumbers, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            result += (aNumbers[i] * bNumbers[i]);
        }

        return result;
    }
}
