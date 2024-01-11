package programmers.q181862;

import java.util.Arrays;

public class Solution {

  public String[] solution(String myStr) {
    String[] result = Arrays.stream(myStr.split("[abc]")).filter(value -> !value.isEmpty()).toArray(String[]::new);
    if (result.length == 0) {
      return new String[]{"EMPTY"};
    }

    return result;
  }
}
