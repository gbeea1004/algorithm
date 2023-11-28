package programmers.q12951;

public class Solution {
  public String solution(String s) {
    String answer = "";
    String[] words = s.toLowerCase().split("");
    boolean isBlank = true;

    for (String word : words) {
      answer += isBlank ? word.toUpperCase() : word;
      isBlank = word.equals(" ");
    }

    return answer;
  }
}
