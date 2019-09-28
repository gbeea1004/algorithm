package coding_test.y2019.programmers_job_09_28.q3;

public class Solution {
    // 해결 못함 - 정확성, 효율성 실패
    // 효율성까지 고려해야하는 문제
    // DP로 풀어야 하나?

    public int solution(int[] sticker) {
        boolean[] visit = new boolean[sticker.length];

        int answer = 0;
        while (true) {
            int maxIndex = 0;
            for (int i = 0; i < sticker.length; i++) {
                if (visit[i]) {
                    continue;
                }

                if (sticker[maxIndex] < sticker[i]) {
                    maxIndex = i;
                }
            }

            visit[maxIndex] = true;
            answer += sticker[maxIndex];
            sticker[maxIndex] = -1;

            if (maxIndex == 0) {
                visit[maxIndex + 1] = true;
            } else if (maxIndex == sticker.length - 1) {
                visit[maxIndex - 1] = true;
            } else {
                visit[maxIndex - 1] = true;
                visit[maxIndex + 1] = true;
            }

            boolean isFinish = true;
            for (int i = 0; i < visit.length; i++) {
                if (!visit[i]) {
                    isFinish = false;
                }
            }

            if (isFinish) {
                break;
            }
        }
        return answer;
    }
}
