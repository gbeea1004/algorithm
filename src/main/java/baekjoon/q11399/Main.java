package baekjoon.q11399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.solution(Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray()));
    }
}

class Solution {
    public int solution(int[] times) {
        int result = 0;

        System.out.println(Arrays.toString(times));
        return result;
    }
}
