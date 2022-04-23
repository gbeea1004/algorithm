package programmers.q42889;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution(int N, int[] stages) {
        Arrays.sort(stages);
        List<Stage> stageList = new ArrayList<>();

        for (int checkStage = 1; checkStage <= N; checkStage++) {
            double notClearedPlayerCount = 0;
            double reachedPlayerCount = stages.length;
            for (int stage : stages) {
                if (checkStage < stage) {
                    break;
                }
                if (checkStage > stage) {
                    reachedPlayerCount--;
                    continue;
                }
                notClearedPlayerCount++;
            }
            if (reachedPlayerCount == 0) {
                stageList.add(new Stage(checkStage, 0));
            } else {
                stageList.add(new Stage(checkStage, notClearedPlayerCount / reachedPlayerCount));
            }
        }

        stageList.sort((a, b) -> Double.compare(b.getFailRate(), a.getFailRate()));

        int[] answer = new int[N];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stageList.get(i).getStage();
        }

        return answer;
    }
}

class Stage {

    private int stage;
    private double failRate;

    public Stage(int stage, double failRate) {
        this.stage = stage;
        this.failRate = failRate;
    }

    public int getStage() {
        return stage;
    }

    public double getFailRate() {
        return failRate;
    }
}
