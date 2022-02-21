package baekjoon.q2503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        int[][] bullsAndCows = new int[n][3];

        for (int i = 0; i < n; i++) {
            bullsAndCows[i] = Arrays.stream(br.readLine().split(" "))
                                    .mapToInt(Integer::parseInt)
                                    .toArray();
        }

        System.out.println(new Solution().solution(bullsAndCows));

        br.close();
    }
}

class Solution {

    private static final int DIGIT = 3;

    public int solution(int[][] bullsAndCows) {
        int result = 0;

        for (int i = 123; i <= 987; i++) {
            if (isSameNo(i) || isZeroNo(i)) {
                continue;
            }

            int passCount = 0;

            for (int j = 0; j < bullsAndCows.length; j++) {
                String questionNo = String.valueOf(bullsAndCows[j][0]);
                String checkNo = String.valueOf(i);
                int strikeCount = getStrikeCount(questionNo, checkNo);
                int ballCount = getBallCount(questionNo, checkNo);

                if (bullsAndCows[j][1] == strikeCount && bullsAndCows[j][2] == ballCount) {
                    passCount++;
                }
            }

            if (passCount == bullsAndCows.length) {
                result++;
            }
        }

        return result;
    }

    private boolean isSameNo(int checkNo) {
        String no = String.valueOf(checkNo);

        if (no.charAt(0) == no.charAt(1)) {
            return true;
        }

        if (no.charAt(1) == no.charAt(2)) {
            return true;
        }

        if (no.charAt(2) == no.charAt(0)) {
            return true;
        }

        return false;
    }

    private boolean isZeroNo(int checkNo) {
        String no = String.valueOf(checkNo);

        return no.charAt(1) == '0' || no.charAt(2) == '0';
    }

    private int getBallCount(String questionNo, String checkNo) {
        int ballCount = 0;

        for (int i = 0; i < DIGIT; i++) {
            for (int j = 0; j < DIGIT; j++) {
                if (i == j) {
                    continue;
                }

                if (questionNo.charAt(i) == checkNo.charAt(j)) {
                    ballCount++;
                    break;
                }
            }
        }

        return ballCount;
    }

    private int getStrikeCount(String questionNo, String checkNo) {
        int strikeCount = 0;

        for (int i = 0; i < DIGIT; i++) {
            if (questionNo.charAt(i) == checkNo.charAt(i)) {
                strikeCount++;
            }
        }

        return strikeCount;
    }
}
