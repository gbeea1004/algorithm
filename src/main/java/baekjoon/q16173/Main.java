package baekjoon.q16173;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        int [][] map = new int[N][N];

        for (int i = 0; i < N; i++) {
            map[i] = Arrays.stream(br.readLine().split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();
        }

        System.out.println(new Solution().solution(map));
    }
}

class Solution {
    private static final String POSSIBLE = "HaruHaru";
    private static final String IMPOSSIBLE = "Hing";
    private static final int[] X_DIR = {0, 1}; // 우, 하
    private static final int[] Y_DIR = {1, 0};
    private int[][] map;
    private boolean isFinish = false;
    private boolean[][] visit;

    public String solution(int[][] map) {
        this.map = map;
        this.visit = new boolean[map.length][map[0].length];

        visit[0][0] = true;
        dfs(0, 0);

        return isFinish ? POSSIBLE: IMPOSSIBLE;
    }

    private void dfs(int x, int y) {
        int jumpPower = map[x][y];

        if (jumpPower == -1) {
            isFinish = true;
            return;
        }

        for (int i = 0; i < 2; i++) {
            int nextX = x + X_DIR[i] * jumpPower;
            int nextY = y + Y_DIR[i] * jumpPower;

            // 경계값 체크
            if (nextX < 0 || nextY < 0 || nextX >= map.length || nextY >= map[0].length) {
                continue;
            }

            // 방문했는지 체크
            if (visit[nextX][nextY]) {
                continue;
            }

            visit[nextX][nextY] = true;
            dfs(nextX, nextY);
        }
    }
}
