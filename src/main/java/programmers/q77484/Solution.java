package programmers.q77484;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static final Map<Integer, Integer> ranks = new HashMap<>();
    static {
        ranks.put(6, 1);
        ranks.put(5, 2);
        ranks.put(4, 3);
        ranks.put(3, 4);
        ranks.put(2, 5);
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int sameCount = 0;
        int zeroCount = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }

            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    sameCount++;
                    break;
                }
            }
        }

        Integer bastRank = getRank(sameCount + zeroCount);
        Integer lowestRank = getRank(sameCount);

        int[] answer = new int[2];
        answer[0] = bastRank;
        answer[1] = lowestRank;

        return answer;
    }

    private Integer getRank(int winCount) {
        Integer rank = ranks.get(winCount);
        return rank != null ? rank : 6;
    }
}
