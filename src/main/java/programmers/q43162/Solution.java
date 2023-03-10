package programmers.q43162;

public class Solution {

    public static final int CONNECT = 1;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            dfs(computers, i, visited);
            answer++;
        }

        return answer;
    }

    private void dfs(int[][] computers, int i, boolean[] visited) {
        visited[i] = true;

        for (int j = 0; j < computers.length; j++) {
            if (isValid(computers, i, visited, j)) {
                dfs(computers, j, visited);
            }
        }
    }

    private boolean isValid(int[][] computers, int i, boolean[] visited, int j) {
        return i != j && computers[i][j] == CONNECT && !visited[j];
    }
}
