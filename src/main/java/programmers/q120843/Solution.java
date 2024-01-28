package programmers.q120843;

public class Solution {

  public int solution(int[] numbers, int k) {
    int playCount = 0;
    int currentIndex = 0;
    int throwerIndex = 0;
    int length = numbers.length;

    while (playCount != k) {
      playCount++;
      throwerIndex = currentIndex;
      currentIndex = (currentIndex + 2) % length;
    }

    return numbers[throwerIndex];
  }
}
