package baekjoon.q1260;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] dot = new int[inputs[0] + 1][inputs[0] + 1];
        for (int i = 0; i < inputs[1]; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            dot[start][end] = 1;
            dot[end][start] = 1;
        }

        Solution solution = new Solution();
        solution.solution(dot, inputs[2]);
    }
}

class Solution {
    public void solution(int[][] dot, int start) {
        boolean[] dfsVisit = new boolean[dot.length];
        boolean[] bfsVisit = new boolean[dot.length];

        // DFS
        dfs(start, dfsVisit, dot);

        System.out.println();

        // BFS
        bfs(start, bfsVisit, dot);
    }

    private void dfs(int node, boolean[] visit, int[][] dot) {
        if (visit[node]) {
            return;
        }

        visit[node] = true;
        System.out.print(node + " ");

        for (int i = 1; i < visit.length; i++) {
            if (dot[node][i] == 1 && !visit[i]) {
                dfs(i, visit, dot);
            }
        }
    }

    private void bfs(int node, boolean[] visit, int[][] dot) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visit[node] = true;
        System.out.print(node + " ");

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for (int i = 0; i < dot.length; i++) {
                if (dot[temp][i] == 1 && !visit[i]) {
                    queue.add(i);
                    visit[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
