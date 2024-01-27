package programmers.q120814;

public class Solution {

  public int solution(int n) {
    int pizzaCount = n / 7;
    if (n % 7 == 0) {
      return pizzaCount;
    }

    return pizzaCount + 1;
  }
}
