package baekjoon.q2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int cookingMinuteTime = scanner.nextInt();

        System.out.println(new Solution().solution(hour, minute, cookingMinuteTime));

        scanner.close();
    }
}

class Solution {

    public String solution(int hour, int minute, int cookingMinuteTime) {
        int addHour = (minute + cookingMinuteTime) / 60;
        hour += addHour;
        minute = (minute + cookingMinuteTime) % 60;

        if (hour >= 24) {
            hour %= 24;
            return hour + " " + minute;
        }
        return hour + " " + minute;
    }
}
