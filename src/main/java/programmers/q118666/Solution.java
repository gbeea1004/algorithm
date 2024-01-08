package programmers.q118666;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public String solution(String[] survey, int[] choices) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < survey.length; i++) {
      int choice = choices[i];
      String types = survey[i];

      if (0 < choice && choice < 4) {
        char first = types.charAt(0);
        map.put(first, map.getOrDefault(first, 0) + 4 - choice);
        continue;
      }

      if (choice > 4) {
        char second = types.charAt(1);
        map.put(second, map.getOrDefault(second, 0) + choice - 4);
      }
    }

    String answer = "";
    answer += getKey('R', 'T', map);
    answer += getKey('C', 'F', map);
    answer += getKey('J', 'M', map);
    answer += getKey('A', 'N', map);
    return answer;
  }

  private String getKey(char first, char second, Map<Character, Integer> map) {
    if (map.getOrDefault(first, 0) >= map.getOrDefault(second, 0)) {
      return String.valueOf(first);
    }
    return String.valueOf(second);
  }
}
