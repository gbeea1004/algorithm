package sw_academy.q84325;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        List<String> results = new ArrayList<>();
        int[] sums = new int[5];
        String[] jobs = new String[5];

        int maxScore = 0;
        for (int i = 0; i < table.length; i++) {
            String[] scores = table[i].split(" ");
            int sum = 0;
            jobs[i] = scores[0];

            for (int j = 1; j < scores.length; j++) {
                String lang = scores[j];
                int score = 6 - j;

                if (!isExist(languages, lang)) {
                    continue;
                }
                sum += preference[indexOf(languages, lang)] * score;
            }

            sums[i] = sum;
            maxScore = Math.max(maxScore, sum);
        }

        for (int i = 0; i < sums.length; i++) {
            if (sums[i] == maxScore) {
                results.add(jobs[i]);
            }
        }
        Collections.sort(results);
        return results.get(0);
    }

    private boolean isExist(String[] languages, String findLang) {
        return Arrays.stream(languages)
                     .anyMatch(findLang::equals);
    }

    private int indexOf(String[] languages, String findLang) {
        for (int i = 0; i < languages.length; i++) {
            if (languages[i].equals(findLang)) {
                return i;
            }
        }
        throw new IllegalArgumentException("찾을 수 없는 언어입니다.");
    }
}
