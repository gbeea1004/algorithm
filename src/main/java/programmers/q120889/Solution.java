package programmers.q120889;

import java.util.Arrays;

public class Solution {

  public int solution(int[] sides) {
    int max = Arrays.stream(sides).max().getAsInt();
    boolean findMax = false;
    int length = sides.length;
    int sum = 0;

    for (int i = 0; i < length; i++) {
      int current = sides[i];
      if (current == max && !findMax) {
        findMax = true;
        continue;
      }

      sum += current;
    }

    if (max < sum) {
      return 1;
    }
    return 2;
  }
}
