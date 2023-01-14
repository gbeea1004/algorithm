package programmers.q131128;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String X, String Y) {
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();
        putInMap(X.split(""), xMap);
        putInMap(Y.split(""), yMap);

        List<String> results = new ArrayList<>();
        for (String key : xMap.keySet()) {
            if (!yMap.containsKey(key)) {
                continue;
            }

            int length = Math.min(xMap.get(key), yMap.get(key));
            for (int i = 0; i < length; i++) {
                results.add(key);
            }
        }

        String result = results.stream()
                               .sorted(Comparator.reverseOrder())
                               .collect(Collectors.joining());

        if (result.isEmpty()) {
            return "-1";
        }

        if (result.replaceAll("0", "").isEmpty()) {
            return "0";
        }

        return result;
    }

    private void putInMap(String[] numbers, Map<String, Integer> map) {
        for (String number : numbers) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
    }
}
