package programmers.q181890;

import java.util.Arrays;

public class Solution {

  public String[] solution(String[] str_list) {
    int length = str_list.length;
    for (int i = 0; i < length; i++) {
      String alphabet = str_list[i];
      if (alphabet.equals("l")) {
        return Arrays.copyOfRange(str_list, 0, i);
      }

      if (alphabet.equals("r")) {
        return Arrays.copyOfRange(str_list, i + 1, length);
      }
    }

    return new String[]{};
  }
}

