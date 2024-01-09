package programmers.q133499;

public class Solution {

  public int solution(String[] babbling) {
    int answer = 0;

    for (int i = 0; i < babbling.length; i++) {
      String word = babbling[i];
      if (word.contains("ayaaya") || word.contains("yeye") || word.contains("woowoo") || word.contains("mama")) {
        continue;
      }

      babbling[i] = babbling[i].replace("aya", " ");
      babbling[i] = babbling[i].replace("ye", " ");
      babbling[i] = babbling[i].replace("woo", " ");
      babbling[i] = babbling[i].replace("ma", " ");
      babbling[i] = babbling[i].replace(" ", "");

      if (babbling[i].length() == 0) {
        answer++;
      }
    }

    return answer;
  }
}
