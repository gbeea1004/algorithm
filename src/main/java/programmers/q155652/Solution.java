package programmers.q155652;

public class Solution {

  public String solution(String s, String skip, int index) {
    String answer = "";

    for (int i = 0; i < s.length(); i++) {
      char alphabet = s.charAt(i);
      for (int count = 1; count <= index; count++) {
        char nextAlphabet = (char) (alphabet + 1);
        if (nextAlphabet == 123) {
          nextAlphabet = 'a';
        }

        if (skip.contains(String.valueOf(nextAlphabet))) {
          alphabet = nextAlphabet;
          count--;
          continue;
        }

        alphabet = nextAlphabet;
      }
      answer += alphabet;
    }

    return answer;
  }
}
