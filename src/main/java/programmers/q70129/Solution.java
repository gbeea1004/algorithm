package programmers.q70129;

import java.util.Arrays;

public class Solution {

  public int[] solution(String s) {
    int playCount = 0;
    int removeCount = 0;
    String[] numbers = s.split("");

    while (numbers.length != 1) {
      playCount++;
      long removeZeroCount = Arrays.stream(numbers).filter(number -> number.equals("0")).count();

      removeCount += removeZeroCount;
      numbers = Long.toBinaryString(numbers.length - removeZeroCount).split("");
    }

    return new int[]{playCount, removeCount};
  }
}
