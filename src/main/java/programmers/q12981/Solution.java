package programmers.q12981;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public int[] solution(int n, String[] words) {
    Map<String, Integer> duplicationCheckWordsMap = new HashMap<>();
    duplicationCheckWordsMap.put(words[0], 1);
    char previousLastAlphabet = words[0].charAt(words[0].length() - 1);

    for (int i = 1; i < words.length; i++) {
      String word = words[i];
      int player = (i % n) + 1;
      int turn = (i / n) + 1;

      if (previousLastAlphabet != word.charAt(0) || duplicationCheckWordsMap.containsKey(word)) {
        return new int[]{player, turn};
      }

      duplicationCheckWordsMap.put(word, 1);
      previousLastAlphabet = word.charAt(word.length() - 1);
    }

    return new int[]{0, 0};
  }
}
