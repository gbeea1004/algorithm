package programmers.q138476;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

  public int solution(int k, int[] tangerines) {
    Map<Integer, Integer> tangerinesCount = new HashMap<>();

    for (int tangerine : tangerines) {
      if (tangerinesCount.containsKey(tangerine)) {
        tangerinesCount.put(tangerine, tangerinesCount.get(tangerine) + 1);
        continue;
      }

      tangerinesCount.put(tangerine, 1);
    }

    List<Integer> keySet = new ArrayList<>(tangerinesCount.keySet());
    keySet.sort((o1, o2) -> tangerinesCount.get(o2).compareTo(tangerinesCount.get(o1)));



    int answer = 0;

    for (Integer key : keySet) {
      Integer count = tangerinesCount.get(key);
      k -= count;
      answer++;
      if (k <= 0) {
        return answer;
      }
    }

    return answer;
  }
}
