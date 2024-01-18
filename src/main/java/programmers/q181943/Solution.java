package programmers.q181943;

public class Solution {

  public String solution(String my_string, String overwrite_string, int s) {
    String answer = "";
    int length = my_string.length();
    int endIndex = s + overwrite_string.length();
    int overIndex = 0;

    for (int i = 0; i < length; i++) {
      if (i >= s && i < endIndex) {
        answer += overwrite_string.charAt(overIndex++);
      } else {
        answer += my_string.charAt(i);
      }
    }

    return answer;
  }
}
