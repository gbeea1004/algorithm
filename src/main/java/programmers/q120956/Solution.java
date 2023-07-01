package programmers.q120956;

import java.util.Arrays;

public class Solution {

  private static final String[] WORDS_TO_SAY = new String[]{"aya", "ye", "woo", "ma"};
  private static final String CHECKED_WORD = "X";

  public int solution(String[] babbling) {
    int answer = 0;

    for (String word : babbling) {
      for (int i = 0; i < WORDS_TO_SAY.length; i++) {
        if (word.contains(WORDS_TO_SAY[i])) {
          word = word.replace(WORDS_TO_SAY[i], CHECKED_WORD);
          i = -1;
        }
      }

      long notCheckedCount = Arrays.stream(word.split("")).filter(alphabet -> !alphabet.equals(CHECKED_WORD)).count();
      if (notCheckedCount == 0) {
        answer++;
      }
    }

    return answer;
  }
}
