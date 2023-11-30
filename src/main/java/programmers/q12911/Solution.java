package programmers.q12911;

public class Solution {

  public int solution(int n) {
    int answer = n;
    int bitCount = Integer.bitCount(n);
    while (true) {
      int nextBitCount = Integer.bitCount(++answer);
      if (bitCount == nextBitCount) {
        break;
      }
    }

    return answer;
  }
}
