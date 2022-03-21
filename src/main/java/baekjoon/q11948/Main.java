package baekjoon.q11948;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        System.out.println(new Solution().solution(a, b, c, d, e, f));

        scanner.close();
    }
}

class Solution {

    public int solution(int a, int b, int c, int d, int e, int f) {
        int result = 0;
        Integer[] aSubjects = {a, b, c, d};
        Integer[] bSubjects = {e, f};
        Arrays.sort(aSubjects, Collections.reverseOrder());
        Arrays.sort(bSubjects, Collections.reverseOrder());

        for (int i = 0; i < aSubjects.length - 1; i++) {
            result += aSubjects[i];
        }
        result += bSubjects[0];

        return result;
    }
}
