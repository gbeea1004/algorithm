package programmers.q12980;

public class Solution {

  public int solution(int n) {
    int answer = 0;

    while (n != 0) {
      if (n % 2 != 0) {
        n--;
        answer++;
        continue;
      }

      n /= 2;
    }

    return answer;
  }
}
