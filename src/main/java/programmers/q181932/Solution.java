package programmers.q181932;

public class Solution {

  public String solution(String code) {
    int mode = 0;
    String[] words = code.split("");
    String answer = "";

    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      if (mode == 0) {
        if (word.equals("1")) {
          mode = 1;
          continue;
        }

        if (i % 2 == 0) {
          answer += word;
        }
      } else {
        if (word.equals("1")) {
          mode = 0;
          continue;
        }

        if (i % 2 == 1) {
          answer += word;
        }
      }
    }

    if (answer.equals("")) {
      return "EMPTY";
    }

    return answer;
  }
}
