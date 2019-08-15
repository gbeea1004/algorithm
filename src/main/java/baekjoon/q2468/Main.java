package baekjoon.q2468;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int size = Integer.parseInt(scanner.nextLine());
        int[][] map = new int[size][size];

        for (int i = 0; i < size; i++) {
            map[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.print(new Solution().solution(map));
    }
}

class Solution {
    private final int[] xDir = {-1, 1, 0, 0};
    private final int[] yDir = {0, 0, -1, 1};
    private int maxCountArea = 1;

    public int solution(int[][] map) {
        int highestArea = Arrays.stream(map).flatMapToInt(Arrays::stream).max().getAsInt();
        int amountOfRain = 1;
        while (amountOfRain <= highestArea) {
            boolean[][] sink = new boolean[map.length][map.length];
            int countArea = 0;

            // 물에 잠기기
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    if (map[i][j] <= amountOfRain) {
                        sink[i][j] = true;
                    }
                }
            }

            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    if (!sink[i][j]) {
                        bfs(new Point(i, j), sink);
                        countArea++;
                    }
                }
            }
            maxCountArea = Math.max(maxCountArea, countArea);
            amountOfRain++;
        }
        return maxCountArea;
    }

    private void bfs(Point start, boolean[][] sink) {
        Queue<Point> points = new LinkedList<>();
        points.add(start);
        sink[start.x][start.y] = true;

        while (!points.isEmpty()) {
            Point point = points.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = point.x + xDir[i];
                int nextY = point.y + yDir[i];

                if (nextX < 0 || nextY < 0 || nextX >= sink.length || nextY >= sink.length) {
                    continue;
                }

                if (!sink[nextX][nextY]) {
                    points.add(new Point(nextX, nextY));
                    sink[nextX][nextY] = true;
                }
            }
        }
    }

    private class Point {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}