package baekjoon.q1292;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int A = scanner.nextInt();
        final int B = scanner.nextInt();

        System.out.println(new Solution().solution(A, B));

        scanner.close();
    }
}

class Solution {

    public int solution(int startPos, int endPos) {
        List<Integer> numbers = new ArrayList<>();
        int currentNo = 1;
        int result = 0;

        while (currentNo <= endPos) {
            for (int i = 0; i < currentNo; i++) {
                numbers.add(currentNo);
            }
            currentNo++;
        }

        for (int i = startPos - 1; i < endPos; i++) {
            result += numbers.get(i);
        }

        return result;
    }
}
