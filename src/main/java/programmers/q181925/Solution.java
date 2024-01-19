package programmers.q181925;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public String solution(int[] numLog) {
    String answer = "";
    int length = numLog.length;
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "w");
    map.put(-1, "s");
    map.put(10, "d");
    map.put(-10, "a");

    for (int i = 1; i < length; i++) {
      answer += map.get(numLog[i] - numLog[i - 1]);
    }

    return answer;
  }
}
