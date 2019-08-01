package baekjoon.q2869;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Solution solution = new Solution();
        System.out.println(solution.solution(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
    }
}

class Solution {
    public int solution(int up, int down, int goal) {
        return (goal - down - 1) / (up - down) + 1;
    }
}