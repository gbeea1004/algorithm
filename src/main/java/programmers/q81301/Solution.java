package programmers.q81301;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static final Map<String, Integer> words = new HashMap<>();

    static {
        words.put("zero", 0);
        words.put("one", 1);
        words.put("two", 2);
        words.put("three", 3);
        words.put("four", 4);
        words.put("five", 5);
        words.put("six", 6);
        words.put("seven", 7);
        words.put("eight", 8);
        words.put("nine", 9);
    }

    public int solution(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder wordChecker = new StringBuilder();

        for (String alphabet : s.split("")) {
            try {
                result.append(Integer.parseInt(alphabet));
            } catch (NumberFormatException e) {
                wordChecker.append(alphabet);
                Integer findNo = words.get(wordChecker.toString());
                if (findNo != null) {
                    result.append(findNo);
                    wordChecker = new StringBuilder();
                }
            }
        }

        return Integer.parseInt(result.toString());
    }
}
