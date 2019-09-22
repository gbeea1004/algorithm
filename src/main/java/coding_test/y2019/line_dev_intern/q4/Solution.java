package coding_test.y2019.line_dev_intern.q4;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfSeat = sc.nextInt();
        int[] seats = new int[countOfSeat];
        for (int i = 0; i < seats.length; i++) {
            seats[i] = sc.nextInt();
        }
        System.out.println(solution(seats));
    }

    public static int solution(int[] seats) {
        int maxAdjacentEmptyCount = 0;
        int adjacentEmptyCount = 0;
        int maxStartIndex = 0;
        int maxEndIndex = 0;
        int currentStartIndex = -1;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                if (currentStartIndex == -1) {
                    currentStartIndex = i;
                }
                adjacentEmptyCount++;
                if (i == seats.length - 1 || seats[i + 1] == 1) {
                    if (maxAdjacentEmptyCount < adjacentEmptyCount) {
                        maxStartIndex = currentStartIndex;
                        maxEndIndex = i;
                        maxAdjacentEmptyCount = adjacentEmptyCount;
                    }
                    adjacentEmptyCount = 0;
                    currentStartIndex = -1;
                }
            }
        }
        if (maxStartIndex == 0 || maxEndIndex == seats.length - 1) {
            return maxAdjacentEmptyCount;
        }
        return maxAdjacentEmptyCount % 2 == 0 ? maxAdjacentEmptyCount / 2 : maxAdjacentEmptyCount / 2 + 1;
    }
}
