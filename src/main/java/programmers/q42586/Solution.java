package programmers.q42586;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int day = 0;

        for (int i = 0; i < progresses.length; i++) {
            int leftProgress = 100 - progresses[i];
            int requireDay = leftProgress / speeds[i];

            if (leftProgress % speeds[i] != 0) {
                requireDay++;
            }

            if (day < requireDay) {
                day = requireDay;
                answer.add(1);
                continue;
            }

            answer.set(answer.size() - 1, answer.get(answer.size() - 1) + 1);
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}
