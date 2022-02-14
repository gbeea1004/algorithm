package baekjoon.q16953;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scanner.nextLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(new Solution().solution(a, b));

        scanner.close();
    }
}

class Solution {

    public long solution(int a, int b) {
        Queue<Number> numbers = new LinkedList<>();
        numbers.add(new Number(a, 1));

        while (!numbers.isEmpty()) {
            Number no = numbers.poll();

            if (no.value > b) {
                continue;
            }

            if (no.value == b) {
                return no.step;
            }

            numbers.add(new Number(no.value * 2, no.step + 1));
            numbers.add(new Number(Long.parseLong(no.value + "1"), no.step + 1));
        }

        return -1;
    }

    class Number {
        private long value;
        private long step;

        public Number(long value, long step) {
            this.value = value;
            this.step = step;
        }
    }
}
