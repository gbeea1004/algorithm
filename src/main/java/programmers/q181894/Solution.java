package programmers.q181894;

import java.util.Arrays;

public class Solution {

  public int[] solution(int[] arr) {
    int length = arr.length;
    int left2Index = -1;
    for (int i = 0; i < length; i++) {
      if (arr[i] == 2) {
        left2Index = i;
        break;
      }
    }

    if (left2Index == -1) {
      return new int[]{-1};
    }

    int right2Index = length;
    for (int i = length - 1; i >= 0; i--) {
      if (arr[i] == 2) {
        right2Index = i;
        break;
      }
    }

    return Arrays.copyOfRange(arr, left2Index, right2Index + 1);
  }
}
