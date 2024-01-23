package programmers.q120890;

import java.util.Arrays;

public class Solution {

  public int solution(int[] array, int n) {
    Arrays.sort(array);
    int length = array.length;
    int nearNumber = 100;
    int[] nears = new int[length];

    for (int i = 0; i < length; i++) {
      int value = Math.abs(n - array[i]);
      nearNumber = Math.min(nearNumber, value);
      nears[i] = value;
    }

    for (int i = 0; i < length; i++) {
      if (nearNumber == nears[i]) {
        return array[i];
      }
    }

    throw new IllegalArgumentException("가까운 수를 찾을 수 없음");
  }
}
