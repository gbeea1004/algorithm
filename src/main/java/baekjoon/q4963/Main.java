package baekjoon.q4963;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int[] mapSize = Arrays.stream(br.readLine().split(" "))
                                  .mapToInt(Integer::parseInt)
                                  .toArray();

            if (mapSize[0] == 0 && mapSize[1] == 0) break;

            int[][] map = new int[mapSize[1]][mapSize[0]];
            for (int i = 0; i < map.length; i++) {
                map[i] = Arrays.stream(br.readLine().split(" "))
                               .mapToInt(Integer::parseInt)
                               .toArray();
            }
            bw.write(String.valueOf(Solution.solution(map)));
            bw.newLine();
        }
        bw.flush();
    }
}

class Solution {
    private static int[] X_DIR = {0, 1, 1, 1, 0, -1, -1, -1}; // 상 부터 오른쪽으로 360도 체크
    private static int[] Y_DIR = {-1, -1, 0, 1, 1, 1, 0, -1};

    public static int solution(int[][] map) {
        int result = 0;
        boolean[][] visited = new boolean[map.length][map[0].length];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                result = bfs(i, j, map, visited, result);
            }
        }
        return result;
    }

    private static int bfs(int x, int y, int[][] map, boolean[][] visited, int result) {
        if (visited[x][y] || map[x][y] == 0) return result;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        queue.add(y);
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int currentX = queue.poll();
            int currentY = queue.poll();

            for (int i = 0; i < X_DIR.length; i++) {
                int nextX = currentX + X_DIR[i];
                int nextY = currentY + Y_DIR[i];

                // 범위 체크
                if (nextX < 0 || nextY < 0 || nextX > map.length - 1 || nextY > map[0].length - 1) continue;

                // 방문 체크 및 바다인가
                if (visited[nextX][nextY] || map[nextX][nextY] == 0) continue;

                queue.add(nextX);
                queue.add(nextY);
                visited[nextX][nextY] = true;
            }
        }
        return ++result;
    }
}