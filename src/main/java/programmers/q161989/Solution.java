package programmers.q161989;

public class Solution {

  public int solution(int n, int m, int[] sections) {
    int answer = 1;
    int start = sections[0];
    int end = start + m - 1;
    for (int i = 1; i < sections.length; i++) {
      int current = sections[i];
      if (start <= current && current <= end) {
        continue;
      }

      start = current;
      end = current + m - 1;
      answer++;
    }

    return answer;
  }
}
