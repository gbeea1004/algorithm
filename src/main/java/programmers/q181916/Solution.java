package programmers.q181916;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

  public int solution(int a, int b, int c, int d) {
    Map<Integer, Integer> counts = initCounts(a, b, c, d);

    if (counts.size() == 1) {
      for (Integer key : counts.keySet()) {
        return 1111 * key;
      }
    }

    if (counts.size() == 2) {
      List<Integer> keys = new ArrayList<>();
      for (Integer key : counts.keySet()) {
        keys.add(key);
      }

      Integer key1 = keys.get(0);
      Integer value1 = counts.get(key1);
      Integer key2 = keys.get(1);
      Integer value2 = counts.get(key2);

      if (value1 == 3) {
        return (10 * key1 + key2) * (10 * key1 + key2);
      }

      if (value2 == 3) {
        return (10 * key2 + key1) * (10 * key2 + key1);
      }

      if (value1 == 2 && value2 == 2) {
        return (key1 + key2) * (Math.abs(key1 - key2));
      }

      throw new IllegalArgumentException();
    }

    if (counts.size() == 3) {
      List<Integer> keys = new ArrayList<>();
      for (Integer key : counts.keySet()) {
        keys.add(key);
      }

      Integer key1 = keys.get(0);
      Integer value1 = counts.get(key1);
      Integer key2 = keys.get(1);
      Integer value2 = counts.get(key2);
      Integer key3 = keys.get(2);
      Integer value3 = counts.get(key3);

      if (value1 == 2) {
        return key2 * key3;
      }

      if (value2 == 2) {
        return key1 * key3;
      }

      if (value3 == 2) {
        return key1 * key2;
      }

      throw new IllegalArgumentException();
    }

    if (counts.size() == 4) {
      int min = 7;
      for (Integer key : counts.keySet()) {
        min = Math.min(min, key);
      }
      return min;
    }

    throw new IllegalArgumentException();
  }

  private Map<Integer, Integer> initCounts(int a, int b, int c, int d) {
    Map<Integer, Integer> counts = new HashMap<>();
    putCounts(a, counts);
    putCounts(b, counts);
    putCounts(c, counts);
    putCounts(d, counts);
    return counts;
  }

  private void putCounts(int number, Map<Integer, Integer> counts) {
    if (counts.containsKey(number)) {
      counts.put(number, counts.get(number) + 1);
      return;
    }
    counts.put(number, 1);
  }
}
