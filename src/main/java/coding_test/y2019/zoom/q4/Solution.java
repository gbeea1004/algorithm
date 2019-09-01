package coding_test.y2019.zoom.q4;

public class Solution {
    public int solution(int[] A) {
        if (A.length == 1) {
            return 1;
        }

        int maxPeriod = 2;
        int currentPeriod = 1;
        int preNo = A[0];
        int isPreStatus = -2; // -2 : 준비 상태

        for (int i = 1; i < A.length; i++) {
            if (A[i] > preNo) { // up
                if (isPreStatus == 1) {
                    maxPeriod = Math.max(maxPeriod, currentPeriod);
                    currentPeriod = 2;
                } else {
                    currentPeriod++;
                }
                isPreStatus = 1;
            } else if (A[i] < preNo) { // down
                if (isPreStatus == -1) {
                    maxPeriod = Math.max(maxPeriod, currentPeriod);
                    currentPeriod = 2;
                } else {
                    currentPeriod++;
                }
                isPreStatus = -1;
            } else { // same
                maxPeriod = Math.max(maxPeriod, currentPeriod);
                currentPeriod = -2;
            }
            preNo = A[i];
        }
        return Math.max(maxPeriod, currentPeriod);
    }
}
