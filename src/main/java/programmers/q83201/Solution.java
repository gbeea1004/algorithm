package programmers.q83201;

public class Solution {
    public String solution(int[][] scores) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < scores.length; i++) {
            int mySelf = scores[i][i];
            int sum = 0;
            int maxScore = -1;
            int minScore = 101;
            int sameCount = 0;

            for (int j = 0; j < scores[0].length; j++) {
                int currentScore = scores[j][i];

                if (currentScore < minScore) {
                    minScore = currentScore;
                }
                if (currentScore > maxScore) {
                    maxScore = currentScore;
                }

                // 나랑 같은지
                if (mySelf == currentScore) {
                    sameCount++;
                }

                sum += currentScore;
            }

            float avg = calculatorAvg(sameCount, mySelf, minScore, maxScore, sum, scores.length);
            sb.append(getGrade(avg));
        }
        return sb.toString();
    }

    private float calculatorAvg(int sameCount, int mySelf, int minScore, int maxScore, int sum, float assignmentCount) {
        if (sameCount == 1 && (mySelf == minScore || mySelf == maxScore)) {
            return (sum - mySelf) / (assignmentCount - 1);
        }
        return sum / assignmentCount;
    }

    private String getGrade(float avg) {
        if (avg >= 90) {
            return "A";
        }
        if (avg >= 80) {
            return "B";
        }
        if (avg >= 70) {
            return "C";
        }
        if (avg >= 50) {
            return "D";
        }
        return "F";
    }
}
