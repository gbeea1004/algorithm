package programmers.q64065;

import java.util.*;

public class Solution {

    public int[] solution(String s) {
        String[] textNumbers = removeBracket(s).split("\\|");
        Map<Integer, Integer> map = getNumberCountMap(textNumbers);
        List<Integer> listKeySet = getKeysOrderByCountDesc(map);

        int[] answer = new int[listKeySet.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = listKeySet.get(i);
        }
        return answer;
    }

    private String removeBracket(String text) {
        return text.substring(2, text.length() - 2)
                   .replace("},{", "|");
    }

    private Map<Integer, Integer> getNumberCountMap(String[] textNumbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (String textNumber : textNumbers) {
            Arrays.stream(textNumber.split(","))
                  .forEach(no -> {
                      Integer number = Integer.parseInt(no);
                      if (map.containsKey(number)) {
                          map.put(number, map.get(number) + 1);
                      } else {
                          map.put(number, 1);
                      }
                  });
        }
        return map;
    }

    private List<Integer> getKeysOrderByCountDesc(Map<Integer, Integer> map) {
        List<Integer> listKeySet = new ArrayList<>(map.keySet());
        listKeySet.sort((value1, value2) -> map.get(value2).compareTo(map.get(value1)));
        return listKeySet;
    }
}
