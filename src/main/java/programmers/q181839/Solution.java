package programmers.q181839;

public class Solution {

  public int solution(int a, int b) {
    if (isOdd(a) && isOdd(b)) {
      return (a * a) + (b * b);
    }

    if (isOdd(a) || isOdd(b)) {
      return 2 * (a + b);
    }

    return Math.abs(a - b);
  }

  private boolean isOdd(int number) {
    return number % 2 == 1;
  }
}
