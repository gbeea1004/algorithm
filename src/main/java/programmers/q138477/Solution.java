package programmers.q138477;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public int[] solution(int k, int[] score) {
        List<Integer> hallOfFame = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (hallOfFame.size() < k) {
                hallOfFame.add(score[i]);
                result.add(getMin(hallOfFame));
            } else {
                Collections.sort(hallOfFame);
                Integer min = hallOfFame.get(0);

                if (score[i] > min) {
                    hallOfFame.remove(0);
                    hallOfFame.add(score[i]);
                    result.add(Math.min(hallOfFame.get(0), hallOfFame.get(hallOfFame.size() - 1)));
                } else {
                    result.add(hallOfFame.get(0));
                }
            }
        }
        int[] results = new int[result.size()];
        for (int i = 0; i < results.length; i++) {
            results[i] = result.get(i);
        }
        return results;
    }

    private Integer getMin(List<Integer> hellOfFame) {
        return hellOfFame.stream()
                         .min(Comparator.comparingInt(o -> o))
                         .get();
    }
}
