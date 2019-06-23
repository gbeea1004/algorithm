package programmers.q42889;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> stage = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            int finalI = i;
            long countOfNoClearPlayer = Arrays.stream(stages).filter(e -> e == finalI).count();
            double countOfReachedStagePlayer = Arrays.stream(stages).filter(e -> e >= finalI).count();
            if (countOfReachedStagePlayer == 0) {
                stage.put(i, 0.0);
                continue;
            }
            stage.put(i, countOfNoClearPlayer / countOfReachedStagePlayer);
        }

        int answerIndex = 0;

        while (stage.size() != 0) {
            double maxFailureRate = -1;
            int maxFailureStage = -1;
            for (Integer stag : stage.keySet()) {
                if (maxFailureRate < stage.get(stag)) {
                    maxFailureRate = stage.get(stag);
                    maxFailureStage = stag;
                }
            }
            answer[answerIndex++] = maxFailureStage;
            stage.remove(maxFailureStage);
        }
        return answer;
    }
}
