package baekjoon.q11403;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        int[][] paths = new int[size][size];
        for (int i = 0; i < paths.length; i++) {
            paths[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        Solution solution = new Solution();
        int[][] result = solution.solution(paths);
        for (int[] line : result) {
            for (int i = 0; i < line.length; i++) {
                if (i == line.length - 1) {
                    bw.write(String.valueOf(line[i]));
                    break;
                }
                bw.write(line[i] + " ");
            }
            bw.newLine();
        }
        bw.flush();
    }
}

class Solution {
    public int[][] solution(int[][] paths) {
        int[][] result = new int[paths.length][paths.length];
        int[] visit = new int[paths.length];

        for (int i = 0; i < result.length; i++) {
            dfs(i, visit, paths); // 행 단위로 경로를 모두 구한다
            for (int j = 0; j < result.length; j++) {
                result[i][j] = visit[j];
            }
            Arrays.fill(visit, 0); // visit 배열을 0으로 초기화
        }
        return result;
    }

    private void dfs(int start, int[] visit, int[][] paths) {
        for (int i = 0; i < paths.length; i++) {
            if (paths[start][i] == 1 && visit[i] == 0) {
                visit[i] = 1;
                dfs(i, visit, paths);
            }
        }
    }
}
