package programmers.q181921;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public int[] solution(int l, int r) {
    List<Integer> result = new ArrayList<>();

    for (int number = l; number <= r; number++) {
      String textNumber = String.valueOf(number);
      if (textNumber.contains("1") || textNumber.contains("2") || textNumber.contains("3") || textNumber.contains("4") || textNumber.contains("6") || textNumber.contains("7") || textNumber.contains("8") || textNumber.contains("9")) {
        continue;
      }

      result.add(number);
    }

    if (result.isEmpty()) {
      return new int[]{-1};
    }

    return result.stream().mapToInt(i -> i).toArray();
  }
}
