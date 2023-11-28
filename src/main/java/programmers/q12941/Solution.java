package programmers.q12941;

import java.util.Arrays;

public class Solution {

  public int solution(int[] A, int[] B) {
    int answer = 0;

    Arrays.sort(A);
    Arrays.sort(B);

    int length = A.length - 1;
    for (int i = 0; i <= length; i++) {
      answer += (A[i] * B[length - i]);
    }

    return answer;
  }
}
