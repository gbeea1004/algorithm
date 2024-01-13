package programmers.q181908;

public class Solution {

  public int solution(String my_string, String is_suffix) {
    int length = my_string.length();

    for (int i = 0; i < length; i++) {
      String text = my_string.substring(i, length);
      if (text.equals(is_suffix)) {
        return 1;
      }
    }

    return 0;
  }
}
