package baekjoon.q2667;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[][] map = new int[count][count];

        for (int[] houses : map) {
            int[] no = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < count; i++) {
                houses[i] = no[i];
            }
        }

        Solution solution = new Solution();
        List<Integer> result = solution.solution(count, map);
        bw.write(String.valueOf(result.size()));
        bw.newLine();

        for (Integer integer : result) {
            bw.write(String.valueOf(integer));
            bw.newLine();
        }
        bw.flush();
    }
}

class Solution {
    private final int[] DX = {-1, 1, 0, 0};
    private final int[] DY = {0, 0, -1, 1};
    private boolean[][] visit;
    private int cnt;

    public List<Integer> solution(int count, int[][] map) {
        List<Integer> result = new ArrayList<>();
        visit = new boolean[count][count];

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (map[i][j] == 1 && !visit[i][j]) {
                    cnt = 1;
                    dfs(i, j, map);
                    result.add(cnt);
                }
            }
        }
        Collections.sort(result);
        return result;
    }

    private void dfs(int x, int y, int[][] map) {
        visit[x][y] = true; // 방문함

        // 위, 아래, 왼, 오 체크
        for (int i = 0; i < 4; i++) {
            int nx = x + DX[i];
            int ny = y + DY[i];

            if (nx >= 0 && ny >= 0 && nx < visit.length && ny < visit.length) { // 범위 안에 있는가
                if (map[nx][ny] == 1 && !visit[nx][ny]) {
                    dfs(nx, ny, map);
                    cnt++;
                }
            }
        }
    }
}
