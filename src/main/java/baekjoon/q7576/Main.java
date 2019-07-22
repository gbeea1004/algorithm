package baekjoon.q7576;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] tomatos = new int[size[1]][size[0]];
        for (int i = 0; i < size[1]; i++) {
            for (int j = 0; j < size[0]; j++) {
                tomatos[i][j] = scanner.nextInt();
            }
        }
        Solution solution = new Solution();
        System.out.println(solution.solution(tomatos));
    }
}

class Solution {
    private int[] dx = {-1, 1, 0, 0};
    private int[] dy = {0, 0, -1, 1};

    public int solution(int[][] tomatos) {
        Queue<Point> queue = new LinkedList<>();

        // 1을 찾는다.
        for (int i = 0; i < tomatos.length; i++) {
            for (int j = 0; j < tomatos[0].length; j++) {
                if (tomatos[i][j] == 1) {
                    queue.add(new Point(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            // 상 하 좌 우 검사
            for (int i = 0; i < 4; i++) {
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];

                // 범위 체크
                if (nextX < 0 || nextY < 0 || nextX >= tomatos.length || nextY >= tomatos[0].length) {
                    continue;
                }

                // 익지 않은 토마토 체크
                if (tomatos[nextX][nextY] != 0) {
                    continue;
                }

                tomatos[nextX][nextY] = tomatos[point.x][point.y] + 1;
                queue.add(new Point(nextX, nextY));
            }
        }

        int max = 0;
        for (int i = 0; i < tomatos.length; i++) {
            for (int j = 0; j < tomatos[0].length; j++) {
                if (tomatos[i][j] == 0) {
                    return -1;
                }
                max = Math.max(max, tomatos[i][j]);
            }
        }
        return max - 1;
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
