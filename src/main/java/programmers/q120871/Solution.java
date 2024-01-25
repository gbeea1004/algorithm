package programmers.q120871;

public class Solution {

  public int solution(int n) {
    int threeTownValue = 0;

    for (int i = 1; i <= n; i++) {
      threeTownValue++;
      if (isContainsThree(threeTownValue)) {
        threeTownValue++;

        while (isContainsThree(threeTownValue)) {
          threeTownValue++;
        }
      }
    }

    return threeTownValue;
  }

  private boolean isContainsThree(int threeTownValue) {
    return threeTownValue % 3 == 0 || String.valueOf(threeTownValue).contains("3");
  }
}
