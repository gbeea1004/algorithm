package coding_test.y2019.programmers_job_09_28.q1;

import java.util.Arrays;

public class Solution {
    public int solution(int[] goods, int[] boxes) {
        int answer = 0;
        Arrays.sort(goods);
        Arrays.sort(boxes);

        int goodIndex = 0;
        for (int box : boxes) {
            if (isFinish(goods.length, goodIndex)) {
                break;
            }

            if (box >= goods[goodIndex]) {
                answer++;
                goodIndex++;
            }
        }
        return answer;
    }

    private boolean isFinish(int goodsLength, int goodIndex) {
        return goodsLength == goodIndex;
    }
}