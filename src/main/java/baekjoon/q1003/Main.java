package baekjoon.q1003;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            int[] result = Solution.solution(number);
            System.out.printf("%d %d\n", result[0], result[1]);
        }
    }
}

class Solution {
    private static List<Print> prints = new ArrayList<>();

    static {
        prints.add(new Print(1, 0));
        prints.add(new Print(0, 1));
        for (int i = 2; i <= 1000; i++) {
            prints.add(new Print(prints.get(i - 1), prints.get(i - 2)));
        }
    }

    public static int[] solution(int no) {
        Print target = prints.get(no);
        return new int[]{target.getZeroCount(), target.getOneCount()};
    }
}

class Print {
    private int zeroCount;
    private int oneCount;

    public Print(Print beforePrint, Print beforeBeforePrint) {
        this.zeroCount = beforePrint.zeroCount + beforeBeforePrint.zeroCount;
        this.oneCount = beforePrint.oneCount + beforeBeforePrint.oneCount;
    }

    public Print(int zeroCount, int oneCount) {
        this.zeroCount = zeroCount;
        this.oneCount = oneCount;
    }

    public int getZeroCount() {
        return zeroCount;
    }

    public int getOneCount() {
        return oneCount;
    }
}
