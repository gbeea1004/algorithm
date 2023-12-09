package programmers.q181830;

public class Solution {

  public int[][] solution(int[][] arr) {
    int hSize = arr.length;
    int vSize = arr[0].length;

    if (hSize == vSize) {
      return arr;
    }

    int max = Math.max(hSize, vSize);
    int[][] result = new int[max][max];
    for (int i = 0; i < hSize; i++) {
      for (int j = 0; j < vSize; j++) {
        result[i][j] = arr[i][j];
      }
    }
    return result;
  }
}
