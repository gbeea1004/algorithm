package baekjoon.q1436;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(Solution.solution(scanner.nextInt()));
    }
}

class Solution {
    private static final String END_OF_NUMBER = "666";

    public static int solution(int countOfEnterMovieTitle) {
        int count = 1;
        int value = 666;
        while (count != countOfEnterMovieTitle) {
            value++;
            if (String.valueOf(value).contains(END_OF_NUMBER)) {
                count++;
            }
        }
        return value;
    }
}
