package baekjoon.q11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] counts = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] graph = new int[counts[0] + 1][counts[0] + 1];
        for (int i = 0; i < counts[1]; i++) {
            int[] aToB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            graph[aToB[0]][aToB[1]] = 1;
            graph[aToB[1]][aToB[0]] = 1;
        }

        System.out.println(new Solution().solution(graph));
    }
}

class Solution {
    private boolean[] visit;
    private int[][] graph;

    public int solution(int[][] graph) {
        this.graph = graph;
        visit = new boolean[graph.length];
        int countOfConnectedComponent = 0;

        for (int i = 1; i < graph.length; i++) {
            if (!visit[i]) {
                dfs(i);
                countOfConnectedComponent++;
            }
        }
        return countOfConnectedComponent;
    }

    private void dfs(int start) {
        visit[start] = true;

        for (int i = 1; i < graph.length; i++) {
            if (graph[start][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }
}
