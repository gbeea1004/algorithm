package programmers.q12953;

public class Solution {

  public int solution(int[] numbers) {
    int currentNumber = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
      int nextNumber = numbers[i];
      currentNumber = lcm(currentNumber, nextNumber);
    }

    return currentNumber;
  }

  private int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }

  private int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }

    return gcd(b, a % b);
  }
}
