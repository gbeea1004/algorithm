package programmers.q161990;

public class Solution {

  public int[] solution(String[] wallpaper) {
    String[][] wallpapers = toWallpapers(wallpaper);

    int minX = 99;
    int minY = 99;
    int maxX = 0;
    int maxY = 0;

    for (int i = 0; i < wallpaper.length; i++) {
      for (int j = 0; j < wallpaper[0].length(); j++) {
        if (wallpapers[i][j].equals("#")) {
          if (minX > i) {
            minX = i;
          }

          if (minY > j) {
            minY = j;
          }

          if (maxX < i) {
            maxX = i;
          }

          if (maxY < j) {
            maxY = j;
          }
        }
      }
    }

    return new int[]{minX, minY, maxX + 1, maxY + 1};
  }

  private String[][] toWallpapers(String[] wallpaper) {
    String[][] result = new String[wallpaper.length][wallpaper[0].length()];
    for (int i = 0; i < wallpaper.length; i++) {
      result[i] = wallpaper[i].split("");
    }

    return result;
  }
}
