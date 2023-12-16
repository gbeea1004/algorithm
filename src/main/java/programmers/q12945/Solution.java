package programmers.q12945;

public class Solution {

  public int solution(int n) {
    if (n == 2) {
      return 1;
    }

    int[] numbers = new int[n + 1];
    numbers[1] = 1;
    numbers[2] = 1;

    for (int i = 3; i <= n; i++) {
      numbers[i] = (numbers[i - 1] + numbers[i - 2]) % 1234567;
    }

    return numbers[n];
  }
}
