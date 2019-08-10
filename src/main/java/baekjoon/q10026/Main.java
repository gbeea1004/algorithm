package baekjoon.q10026;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = scanner.nextInt();
        String[][] paper = new String[SIZE][SIZE];

        for (int i = 0; i < paper.length; i++) {
            paper[i] = scanner.next().split("");
        }
        System.out.print(new Solution().solution(paper));
    }
}


class Solution {
    private final int[] X_DIR = {-1, 1, 0, 0};
    private final int[] Y_DIR = {0, 0, -1, 1};
    private String[][] paper;
    private boolean[][] visitNotColorPills;
    private boolean[][] visitColorPills;

    public String solution(String[][] paper) {
        this.paper = paper;
        this.visitNotColorPills = new boolean[paper.length][paper.length];
        this.visitColorPills = new boolean[paper.length][paper.length];

        int countOfNotColorPills = 0;
        int countOfColorPills = 0;

        for (int i = 0; i < paper.length; i++) {
            for (int j = 0; j < paper.length; j++) {
                // 일반 사람
                if (!visitNotColorPills[i][j]) {
                    isNotColorPills(new Point(i, j));
                    countOfNotColorPills++;
                }

                // 적록색약 사람
                if (!visitColorPills[i][j]) {
                    isColorPills(new Point(i, j));
                    countOfColorPills++;
                }
            }
        }
        return countOfNotColorPills + " " + countOfColorPills;
    }

    private void isNotColorPills(Point start) {
        Queue<Point> points = new LinkedList<>();
        points.add(start);
        visitNotColorPills[start.x][start.y] = true;

        while (!points.isEmpty()) {
            Point point = points.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = point.x + X_DIR[i];
                int nextY = point.y + Y_DIR[i];

                if (nextX < 0 || nextY < 0 || nextX >= paper.length || nextY >= paper.length) {
                    continue;
                }

                if (visitNotColorPills[nextX][nextY]) {
                    continue;
                }

                // 같은 색인 경우 계속 탐색
                if (paper[point.x][point.y].equals(paper[nextX][nextY])) {
                    visitNotColorPills[nextX][nextY] = visitNotColorPills[point.x][point.y];
                    points.add(new Point(nextX, nextY));
                    visitNotColorPills[nextX][nextY] = true;
                }
            }
        }
    }

    private void isColorPills(Point start) {
        Queue<Point> points = new LinkedList<>();
        points.add(start);
        visitColorPills[start.x][start.y] = true;

        while (!points.isEmpty()) {
            Point point = points.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = point.x + X_DIR[i];
                int nextY = point.y + Y_DIR[i];

                if (nextX < 0 || nextY < 0 || nextX >= paper.length || nextY >= paper.length) {
                    continue;
                }

                if (visitColorPills[nextX][nextY]) {
                    continue;
                }

                if (paper[point.x][point.y].equals(paper[nextX][nextY])
                        || ((paper[nextX][nextY].equals("R") || paper[nextX][nextY].equals("G"))
                        && (paper[point.x][point.y].equals("R") || paper[point.x][point.y].equals("G")))) {
                    points.add(new Point(nextX, nextY));
                    visitColorPills[nextX][nextY] = true;
                }
            }
        }
    }

    class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}