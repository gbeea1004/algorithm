package baekjoon.q1012;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[][][] fields = new int[count][][];

        for (int i = 0; i < count; i++) {
            int[] size = new int[3];
            size[0] = scanner.nextInt();
            size[1] = scanner.nextInt();
            size[2] = scanner.nextInt();
            fields[i] = new int[size[0]][size[1]];
            for (int j = 0; j < size[2]; j++) {
                int xPos = scanner.nextInt();
                int yPos = scanner.nextInt();
                fields[i][xPos][yPos] = 1;
            }
        }

        Solution solution = new Solution();
        solution.solution(fields);
    }
}

class Solution {
    private int[] xPos = {-1, 1, 0, 0};
    private int[] yPos = {0, 0, -1, 1};
    private int sizeX;
    private int sizeY;

    public void solution(int[][][] fields) {
        for (int[][] field : fields) {
            boolean[][] visit = new boolean[field.length][field[0].length];
            int no = 0;
            sizeX = field.length;
            sizeY = field[0].length;

            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    if (field[i][j] == 1 && !visit[i][j]) {
                        bfs(i, j, visit, field);
                        no++;
                    }
                }
            }
            System.out.println(no);
        }
    }

    private void bfs(int x, int y, boolean[][] visit, int[][] field) {
        Queue<Point> points = new LinkedList<>();
        points.add(new Point(x, y));
        visit[x][y] = true;

        while (!points.isEmpty()) {
            Point point = points.poll();

            // 상 하 좌 우 체크
            for (int i = 0; i < 4; i++) {
                int nextX = point.x + xPos[i];
                int nextY = point.y + yPos[i];

                // 범위 체크
                if (nextX < 0 || nextY < 0 || nextX >= sizeX || nextY >= sizeY || visit[nextX][nextY]) {
                    continue;
                }

                // 배추가 심어져있는지 체크
                if (field[nextX][nextY] != 1) {
                    continue;
                }

                visit[nextX][nextY] = true;
                points.add(new Point(nextX, nextY));
            }
        }

    }

    private class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
