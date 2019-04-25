package programmers.q49994;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("LULLLLLLU"));
    }
}

class Solution {
    final String UP = "U";
    final String DOWN = "D";
    final String LEFT = "L";
    final String RIGHT = "R";
    static Map<String, Point> map = new HashMap<>();

    public Solution() {
        if (map.size() < 4) {
            map.put(UP, new Point(0, 1));
            map.put(DOWN, new Point(0, -1));
            map.put(LEFT, new Point(-1, 0));
            map.put(RIGHT, new Point(1, 0));
        }
    }

    public int solution(String dirs) {
        String[] directions = dirs.split("");
        Map<Dir, Integer> points = new HashMap<>();

        int startX = 0;
        int startY = 0;
        for (String direction : directions) {
            Dir dir = new Dir(new Point(startX, startY), new Point(startX, startY));
            Point afterDir = dir.moveDir(direction);
            startX = afterDir.getX();
            startY = afterDir.getY();

            dir.sameCheck(points);
        }

        for (Dir dir : points.keySet()) {
            System.out.println(dir);
        }
        return points.size();
    }
}

class Dir {
    private final Point before;
    private Point after;

    public Dir(Point before, Point after) {
        this.before = before;
        this.after = after;
    }

    public Point moveDir(String dir) {
        return after.move(dir);
    }

    public void sameCheck(Map<Dir, Integer> points) {
        if (points.get(this) == null && points.get(new Dir(after, before)) == null) {
            if (!before.equals(after)) {
                points.put(this, 1);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dir dir = (Dir) o;
        return Objects.equals(before, dir.before) &&
                Objects.equals(after, dir.after);
    }

    @Override
    public int hashCode() {
        return Objects.hash(before, after);
    }

    @Override
    public String toString() {
        return "Dir{" +
                "before=" + before +
                ", after=" + after +
                '}';
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point move(String dir) {
        Point point = Solution.map.get(dir);
        if (Math.abs(x + point.x) <= 5 && Math.abs(y + point.y) <= 5) {
            this.x += point.x;
            this.y += point.y;
        }
        return this;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}