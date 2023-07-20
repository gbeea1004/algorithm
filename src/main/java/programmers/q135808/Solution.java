package programmers.q135808;

import java.util.Arrays;

public class Solution {

  public int solution(int k, int m, int[] score) {
    Arrays.sort(score);
    int answer = 0;
    int boxIndex = score.length - m;

    while (boxIndex >= 0) {
      answer += score[boxIndex] * m;
      boxIndex -= m;
    }

    return answer;
  }
}
