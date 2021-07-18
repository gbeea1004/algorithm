package baekjoon.q2667;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[][] map = new int[N][N];

        for (int i = 0; i < N; i++) {
            map[i] = Arrays.stream(scanner.nextLine().split(""))
                           .mapToInt(Integer::parseInt).toArray();
        }

        new Solution().solution(map);
    }
}

class Solution {
    private static final int[] X_DIR = {-1, 1, 0, 0}; // 상하좌우
    private static final int[] Y_DIR = {0, 0, -1, 1};
    private int[][] map;

    public void solution(int[][] map) {
        this.map = map;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 1) {
                    result.add(bfs(i, j));
                }
            }
        }
        Collections.sort(result);

        System.out.println(result.size());
        for (Integer number : result) {
            System.out.println(number);
        }
    }

    public int bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        map[x][y] = 4; // 방문함

        int count = 1;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = point.getX() + X_DIR[i];
                int nextY = point.getY() + Y_DIR[i];

                // 경계값 체크
                if (nextX < 0 || nextY < 0 || nextX >= map.length || nextY >= map[0].length) {
                    continue;
                }

                if (map[nextX][nextY] == 4) {
                    continue;
                }

                if (map[nextX][nextY] == 1) {
                    count++;
                    queue.add(new Point(nextX, nextY));
                    map[nextX][nextY] = 4; // 방문함
                }
            }
        }
        return count;
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