package baekjoon.q2583;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[][] map = new int[m][n];
        for (int i = 0; i < k; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int toX = scanner.nextInt();
            int toY = scanner.nextInt();

            for (int j = x; j < toX; j++) {
                for (int l = y; l < toY; l++) {
                    map[l][j] = 1;
                }
            }
        }

        new Solution().solution(map);
    }
}

class Solution {
    private static int size = 0;
    private boolean[][] visit;
    private int[][] map;
    private int[] xDir = {-1, 1, 0, 0};
    private int[] yDir = {0, 0, -1, 1};

    public void solution(int[][] map) {
        this.map = map;
        visit = new boolean[map.length][map[0].length];
        List<Integer> results = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 0 && !visit[i][j]) {
                    size = 0;
                    dfs(i, j);
                    results.add(size);
                    count++;
                }
            }
        }

        Collections.sort(results);
        System.out.println(count);
        for (int i = 0; i < results.size() - 1; i++) {
            System.out.print(results.get(i) + " ");
        }
        System.out.print(results.get(results.size() - 1));
    }

    private void dfs(int x, int y) {
        visit[x][y] = true;
        size++;

        for (int i = 0; i < 4; i++) {
            int nextX = x + xDir[i];
            int nextY = y + yDir[i];

            if (nextX < 0 || nextY < 0 || nextX >= map.length || nextY >= map[0].length) {
                continue;
            }

            if (map[nextX][nextY] == 0 && !visit[nextX][nextY]) {
                dfs(nextX, nextY);
            }
        }
    }
}
