package programmers.q181837;

public class Solution {

  public int solution(String[] order) {
    int answer = 0;

    for (String menu : order) {
      if (isAmericano(menu)) {
        answer += 4500;
        continue;
      }

      if (isCafeLatte(menu)) {
        answer += 5000;
        continue;
      }

      answer += 4500;
    }

    return answer;
  }

  private boolean isAmericano(String menu) {
    return menu.contains("americano");
  }

  private boolean isCafeLatte(String menu) {
    return menu.contains("cafelatte");
  }
}
