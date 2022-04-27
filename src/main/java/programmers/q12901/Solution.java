package programmers.q12901;

public class Solution {

    public String solution(int a, int b) {
        int[] lastDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int currentDaysOfWeekIndex = 0;

        for (int i = 0; i < a - 1; i++) {
            currentDaysOfWeekIndex += lastDays[i];
        }
        currentDaysOfWeekIndex += b - 1;

        return daysOfWeek[currentDaysOfWeekIndex % 7];
    }
}
