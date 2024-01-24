package programmers.q120880;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

  public int[] solution(int[] numlist, int n) {
    List<Integer> numbers = Arrays.stream(numlist).boxed().collect(Collectors.toList());
    List<Integer> answer = new ArrayList<>();

    while (!numbers.isEmpty()) {
      int size = numbers.size();
      int bestDiff = 99999999;
      int nearIndex = 99999999;
      for (int i = 0; i < size; i++) {
        Integer current = numbers.get(i);
        int diff = Math.abs(current - n);
        if (diff < bestDiff) {
          bestDiff = diff;
          nearIndex = i;
        } else if (diff == bestDiff) {
          if (current > numbers.get(nearIndex)) {
            bestDiff = diff;
            nearIndex = i;
          }
        }
      }

      answer.add(numbers.get(nearIndex));
      numbers.remove(nearIndex);
    }

    return answer.stream().mapToInt(number -> number).toArray();
  }
}
