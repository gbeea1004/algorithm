package programmers.q120923;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public int[] solution(int num, int total) {
    int startNumber = -100; // 임의로 -100 부터 시작
    while (true) {
      List<Integer> result = new ArrayList<>();
      int totalNumber = 0;
      int end = startNumber + num;
      for (int i = startNumber; i < end; i++) {
        totalNumber += i;
        result.add(i);
      }

      if (totalNumber == total) {
        return result.stream().mapToInt(number -> number).toArray();
      }
      startNumber++;
    }
  }
}
