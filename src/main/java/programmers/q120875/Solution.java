package programmers.q120875;

public class Solution {

  public int solution(int[][] dots) {
    Point point1 = new Point(dots[0][0], dots[0][1]);
    Point point2 = new Point(dots[1][0], dots[1][1]);
    Point point3 = new Point(dots[2][0], dots[2][1]);
    Point point4 = new Point(dots[3][0], dots[3][1]);

    // 12 34
    if (isSameSlope(point1, point2, point3, point4)) {
      return 1;
    }
    // 13 24
    if (isSameSlope(point1, point3, point2, point4)) {
      return 1;
    }
    // 14 23
    if (isSameSlope(point1, point4, point2, point3)) {
      return 1;
    }
    return 0;
  }

  private boolean isSameSlope(Point point1, Point point2, Point point3, Point point4) {
    double slope1 = (double) (point2.y - point1.y) / (point2.x - point1.x);
    double slope2 = (double) (point4.y - point3.y) / (point4.x - point3.x);

    return slope1 == slope2;
  }

  class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}
