package programmers.q120815;

public class Solution {

  public int solution(int n) {
    int pizzaCount = n / 6;
    if (pizzaCount == 0) {
      pizzaCount = 1;
    }
    while (true) {
      if ((pizzaCount * 6) % n == 0) {
        return pizzaCount;
      }
      pizzaCount++;
    }
  }
}
