package programmers.q120886;

import java.util.Arrays;

public class Solution {

  public int solution(String before, String after) {
    int answer = 0;

    String[] a = before.split("");
    String[] b = after.split("");
    Arrays.sort(a);
    Arrays.sort(b);

    return Arrays.toString(a).equals(Arrays.toString(b)) ? 1 : 0;
  }
}
