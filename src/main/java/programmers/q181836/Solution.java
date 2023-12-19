package programmers.q181836;

public class Solution {

  public String[] solution(String[] picture, int k) {
    int rows = picture.length * k;
    int cols = picture[0].length() * k;
    String[] answer = new String[rows];

    for (int i = 0; i < rows; i++) {
      String text = "";
      int row = i / k;
      for (int j = 0; j < cols; j++) {
        int col = j / k;
        text += picture[row].charAt(col);
      }
      answer[i] = text;
    }

    return answer;
  }
}
