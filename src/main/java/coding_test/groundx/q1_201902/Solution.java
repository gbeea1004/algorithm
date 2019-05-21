package coding_test.groundx.q1_201902;

/*
 * 냉장고가 열려있는 시간은?
 */

public class Solution {
    public int solution(int[] open, int[] close) {
        int openTime = 0;

        int checkOpenIndex = 0;
        int checkCloseIndex = 0;
        int start = -1;
        boolean isStart = false;

        while (open.length > checkOpenIndex) {
            if (open[checkOpenIndex] > close[checkCloseIndex]) {
                checkCloseIndex++;
                continue;
            }
            if (open.length > checkOpenIndex + 1) {
                if (open[checkOpenIndex + 1] < close[checkCloseIndex]) {
                    if (!isStart) {
                        isStart = true;
                        start = open[checkOpenIndex];
                    }
                    checkOpenIndex++;
                    continue;
                }
            }
            if (isStart) {
                openTime += close[checkCloseIndex] - start;
                isStart = false;
                checkOpenIndex++;
                if (checkCloseIndex < close.length - 1) {
                    checkCloseIndex++;
                }
                continue;
            }
            openTime += close[checkCloseIndex] - open[checkOpenIndex];
            checkOpenIndex++;
            checkCloseIndex++;
        }
        return openTime;
    }
}
