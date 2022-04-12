package baekjoon.q1453;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] persons = Arrays.stream(scanner.nextLine().split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();

        System.out.println(new Solution().solution(persons));

        scanner.close();
    }
}

class Solution {

    public int solution(int[] persons) {
        int result = 0;
        boolean[] visit = new boolean[101];

        for (int person : persons) {
            if (visit[person]) {
                result++;
                continue;
            }
            visit[person] = true;
        }

        return result;
    }
}
