package programmers.q131701;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public int solution(int[] elements) {
    Set<Integer> numbers = new HashSet<>();
    int length = elements.length;

    for (int count = 1; count <= length; count++) {
      for (int i = 0; i < elements.length; i++) {
        int value = 0;
        for (int j = i; j < i + count; j++) {
          value += elements[j % elements.length];
        }
        numbers.add(value);
      }
    }

    return numbers.size();
  }
}
