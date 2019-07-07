package programmers.q42841;

public class Solution {
    public int solution(int[][] baseball) {
        int answer = 0;
        for (int i = 123; i <= 987; i++) {
            if (isSatisfied(i, baseball)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isSatisfied(int no, int[][] baseball) {
        String noToString = String.valueOf(no);
        if (noToString.charAt(1) == '0' || noToString.charAt(2) == '0' ||
                noToString.charAt(0) == noToString.charAt(1) ||
                noToString.charAt(0) == noToString.charAt(2) ||
                noToString.charAt(1) == noToString.charAt(2)) {
            return false;
        }

        for (int i = 0; i < baseball.length; i++) {
            int strick = 0;
            int ball = 0;

            String checkNo = String.valueOf(baseball[i][0]);

            if (noToString.charAt(0) == checkNo.charAt(0)) {
                strick++;
            }
            if (noToString.charAt(1) == checkNo.charAt(1)) {
                strick++;
            }
            if (noToString.charAt(2) == checkNo.charAt(2)) {
                strick++;
            }

            if (noToString.charAt(0) == checkNo.charAt(1)) {
                ball++;
            }
            if (noToString.charAt(0) == checkNo.charAt(2)) {
                ball++;
            }
            if (noToString.charAt(1) == checkNo.charAt(0)) {
                ball++;
            }
            if (noToString.charAt(1) == checkNo.charAt(2)) {
                ball++;
            }
            if (noToString.charAt(2) == checkNo.charAt(0)) {
                ball++;
            }
            if (noToString.charAt(2) == checkNo.charAt(1)) {
                ball++;
            }

            if (baseball[i][1] != strick || baseball[i][2] != ball) {
                return false;
            }
        }
        System.out.println(no);
        return true;
    }
}
