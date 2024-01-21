package programmers.q120921;

public class Solution {

  public int solution(String A, String B) {
    if (A.equals(B)) {
      return 0;
    }

    int answer = 0;
    int count = A.length();

    for (int i = 0; i < count; i++) {
      A = A.charAt(count - 1) + A.substring(0, count - 1);
      answer++;

      if (A.equals(B)) {
        return answer;
      }
    }

    return -1;
  }
}
