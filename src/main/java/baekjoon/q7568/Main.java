package baekjoon.q7568;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[][] people = new int[count][2];

        for (int i = 0; i < count; i++) {
            people[i][0] = scanner.nextInt();
            people[i][1] = scanner.nextInt();
        }

        System.out.print(Solution.solution(people));
    }
}

class Solution {
    public static String solution(int[][] people) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < people.length) {
            int rank = 1;
            int[] my = people[index];

            for (int i = 0; i < people.length; i++) {
                if (index == i) {
                    continue;
                }
                if (people[i][0] > my[0] && people[i][1] > my[1]) {
                    rank++;
                }
            }
            sb.append(rank).append(" ");
            index++;
        }
        return sb.toString();
    }
}
