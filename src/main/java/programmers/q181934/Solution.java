package programmers.q181934;

public class Solution {

  public int solution(String ineq, String eq, int n, int m) {
    if (ineq.equals(">")) {
      if (eq.equals("=")) {
        return convert(n >= m);
      }

      if (eq.equals("!")) {
        return convert(n > m);
      }
    }

    if (ineq.equals("<")) {
      if (eq.equals("=")) {
        return convert(n <= m);
      }

      if (eq.equals("!")) {
        return convert(n < m);
      }
    }

    throw new IllegalArgumentException();
  }

  private int convert(boolean expression) {
    return expression ? 1 : 0;
  }
}
