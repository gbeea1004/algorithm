package programmers.q120907;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public String[] solution(String[] quiz) {
    List<String> answer = new ArrayList<>();

    for (String problem : quiz) {
      String[] texts = problem.split(" ");
      int a = Integer.parseInt(texts[0]);
      String operator = texts[1];
      int b = Integer.parseInt(texts[2]);
      int result = Integer.parseInt(texts[4]);

      if (operator.equals("+")) {
        if (a + b == result) {
          answer.add("O");
        } else {
          answer.add("X");
        }
        continue;
      }

      if (operator.equals("-")) {
        if (a - b == result) {
          answer.add("O");
        } else {
          answer.add("X");
        }
        continue;
      }

      throw new IllegalArgumentException();
    }
    
    return answer.toArray(new String[answer.size()]);
  }
}
