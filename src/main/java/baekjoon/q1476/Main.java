package baekjoon.q1476;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int E = scanner.nextInt();
        final int S = scanner.nextInt();
        final int M = scanner.nextInt();

        System.out.println(new Solution().solution(E, S, M));

        scanner.close();
    }
}

class Solution {

    public int solution(int e, int s, int m) {
        Year current = new Year(1, 1, 1);
        Year target = new Year(e, s, m);
        int year = 1;

        while (true) {
            if (current.isSameYear(target)) {
                break;
            }

            current.addOneYear();
            year++;
        }

        return year;
    }

    class Year {

        private int e;
        private int s;
        private int m;

        public Year(int e, int s, int m) {
            this.e = e;
            this.s = s;
            this.m = m;
        }

        public boolean isSameYear(Year year) {
            return this.e == year.e && this.s == year.s && this.m == year.m;
        }

        public void addOneYear() {
            e = e == 15 ? 1 : e + 1;
            s = s == 28 ? 1 : s + 1;
            m = m == 19 ? 1 : m + 1;
        }
    }
}