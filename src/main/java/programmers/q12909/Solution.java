package programmers.q12909;

import java.util.Stack;

public class Solution {

  private static final char OPEN = '(';
  private static final char CLOSE = ')';

  boolean solution(String s) {
    Stack<String> stack = new Stack<>();
    int size = s.length();

    for (int i = 0; i < size; i++) {
      char braket = s.charAt(i);
      if (braket == OPEN) {
        stack.push("(");
        continue;
      }

      if (stack.empty()) {
        return false;
      }

      stack.pop();
    }

    return stack.empty();
  }
}
