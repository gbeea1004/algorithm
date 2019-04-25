package programmers.q43162;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(solution.solution(n, computers));
    }
}

class Solution {
    private boolean[] visit;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                dfs(computers, i, n);
                answer++;
            }
        }
        return answer;
    }

    private void dfs(int[][] computers, int index, int n) {
        visit[index] =true;
        for (int i = 0; i < n; i++) {
            if (computers[index][i] == 1 && !visit[i]) {
                dfs(computers, i, n);
            }
        }
    }
}
