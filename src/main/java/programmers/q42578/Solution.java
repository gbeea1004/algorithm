package programmers.q42578;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {

  public int solution(String[][] clothes) {
    Map<String, Integer> map = getMap(clothes);

    int result = 1;
    Iterator<Integer> iterator = map.values().iterator();
    while (iterator.hasNext()) {
      result *= iterator.next().intValue() + 1;
    }

    return result - 1;
  }

  private Map<String, Integer> getMap(String[][] clothes) {
    Map<String, Integer> map = new HashMap<>();
    for (String[] clothe : clothes) {
      String key = clothe[1];
      map.put(key, map.getOrDefault(key, 0) + 1);
    }

    return map;
  }
}
