package programmers.q160586;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static final int NOT_FOUND = -1;
    public static final int MAX_CLICK_COUNT = 999999999;

    public int[] solution(String[] keymap, String[] targets) {
        List<Integer> result = new ArrayList<>();

        for (String target : targets) {
            String[] alphabets = target.split("");
            int count = 0;
            boolean isNotFound = false;

            for (String alphabet : alphabets) {
                int minClickCount = MAX_CLICK_COUNT;

                for (String key : keymap) {
                    int clickCount = key.indexOf(alphabet) + 1;
                    if (clickCount == 0) {
                        continue;
                    }

                    minClickCount = Math.min(clickCount, minClickCount);
                }

                if (isNotFound(minClickCount)) {
                    isNotFound = true;
                    break;
                }

                count += minClickCount;
            }

            if (isNotFound) {
                result.add(NOT_FOUND);
            } else {
                result.add(count);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    private boolean isNotFound(int minClickCount) {
        return minClickCount == MAX_CLICK_COUNT;
    }
}
