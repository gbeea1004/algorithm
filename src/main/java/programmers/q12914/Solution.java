package programmers.q12914;

public class Solution {

  public long solution(int n) {
    if (n == 1) {
      return 1;
    }

    if (n == 2) {
      return 2;
    }

    long[] numbers = new long[2002];
    numbers[1] = 1;
    numbers[2] = 2;

    for (int i = 3; i <= n; i++) {
      numbers[i] = (numbers[i - 1] + numbers[i - 2]) % 1234567;
    }

    return numbers[n] % 1234567;
  }
}
