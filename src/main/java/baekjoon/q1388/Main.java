package baekjoon.q1388;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        String[][] floors = new String[input[0]][input[1]];

        for (int i = 0; i < input[0]; i++) {
            floors[i] = scanner.nextLine().split("");
        }

        System.out.println(new Solution().solution(floors));
    }
}

class Solution {
    private final int[] X_DIR = {-1, 1, 0, 0};
    private final int[] Y_DIR = {0, 0, -1, 1};

    public int solution(String[][] floors) {
        int floorCount = 0;

        for (int i = 0; i < floors.length; i++) {
            for (int j = 0; j < floors[0].length; j++) {
                if (floors[i][j].equals("-") || floors[i][j].equals("|")) {
                    floorCount++;
                    bfs(i, j, floors);
                }
            }
        }
        return floorCount;
    }

    public void bfs(int x, int y, String[][] floors) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        String check = floors[x][y];

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            floors[point.getX()][point.getY()] = "O";

            if (check.equals("-")) {
                for (int i = 2; i <= 3; i++) {
                    int nextX = point.getX() + X_DIR[i];
                    int nextY = point.getY() + Y_DIR[i];

                    // 가능하지 않은 x, y 값 체크
                    if (nextX < 0 || nextY < 0 || nextX >= floors.length || nextY >= floors[0].length) {
                        continue;
                    }

                    if (floors[nextX][nextY].equals("O")) {
                        continue;
                    }

                    if (floors[nextX][nextY].equals("|")) {
                        continue;
                    }

                    queue.add(new Point(nextX, nextY));
                }
            } else if (check.equals("|")) {
                for (int i = 0; i <= 1; i++) {
                    int nextX = point.getX() + X_DIR[i];
                    int nextY = point.getY() + Y_DIR[i];

                    // 가능하지 않은 x, y 값 체크
                    if (nextX < 0 || nextY < 0 || nextX >= floors.length || nextY >= floors[0].length) {
                        continue;
                    }

                    if (floors[nextX][nextY].equals("O")) {
                        continue;
                    }

                    if (floors[nextX][nextY].equals("-")) {
                        continue;
                    }

                    queue.add(new Point(nextX, nextY));
                }
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}