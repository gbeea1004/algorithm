package programmers.q181903;

public class Solution {

  public String solution(int q, int r, String code) {
    String answer = "";

    String[] codes = code.split("");
    for (int i = 0; i < codes.length; i++) {
      if (i % q == r) {
        answer += codes[i];
      }
    }

    return answer;
  }
}
