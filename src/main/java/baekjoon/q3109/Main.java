package baekjoon.q3109;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int R = scanner.nextInt();
        final int C = scanner.nextInt();
        scanner.nextLine();
        String[][] map = new String[R][C];

        for (int i = 0; i < R; i++) {
            map[i] = scanner.nextLine().split("");
        }
        System.out.println(new Solution().solution(map));
    }
}

class Solution {
    private String[][] map;
    private boolean[][] visit;
    private int[] xDir = {-1, 0, 1};
    private int maxCount = 0;

    public int solution(String[][] map) {
        this.map = map;
        visit = new boolean[map.length][map[0].length];

        for (int i = 0; i < map.length; i++) {
            dfs(i);
        }
        return maxCount;
    }

    private void dfs(int start) {
        Stack<Point> stack = new Stack<>();
        if (map[start][0].equals("X")) {
            return;
        }
        stack.push(new Point(start, 0));
        visit[start][0] = true;

        while (!stack.isEmpty()) {
            Point point = stack.peek();

            if (point.y == map[0].length - 1) {
                maxCount++;
                break;
            }

            boolean flag = false;

            for (int i = 0; i < 3; i++) {
                int nextX = point.x + xDir[i];
                int nextY = point.y + 1;

                // 범위체크
                if (nextX < 0 || nextY < 0 || nextX >= map.length || nextY >= map[0].length) {
                    continue;
                }

                // 막힌 길 체크
                if (map[nextX][nextY].equals("x")) {
                    continue;
                }

                if (!visit[nextX][nextY]) {
                    stack.push(new Point(nextX, nextY));
                    visit[nextX][nextY] = true;
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                stack.pop();
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