package programmers.q176963;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] solution(String[] names, int[] yearning, String[][] photos) {
        Map<String, Integer> scores = getScores(names, yearning);
        int length = photos.length;
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            int score = 0;
            for (String name : photos[i]) {
                if (scores.containsKey(name)) {
                    score += scores.get(name);
                }
            }

            answer[i] = score;
        }

        return answer;
    }

    private Map<String, Integer> getScores(String[] names, int[] yearning) {
        Map<String, Integer> scores = new HashMap<>();
        int length = names.length;

        for (int i = 0; i < length; i++) {
            scores.put(names[i], yearning[i]);
        }
        return scores;
    }
}
