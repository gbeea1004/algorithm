package programmers.q12924;

public class Solution {

  public int solution(int n) {
    int answer = 0;

    for (int i = n; i >= 1; i--) {
      int sum = 0;
      for (int j = i; j >= 1; j--) {
        sum += j;
        if (sum == n) {
          answer++;
          break;
        } else if (sum > n) {
          break;
        }
      }
    }

    return answer;
  }
}
