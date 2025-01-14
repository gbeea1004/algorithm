package programmers.q87946;

public class Solution {

    private boolean[] visited;
    private int maxVisitCount;

    public int solution(int k, int[][] dungeons) {
        maxVisitCount = 0;
        visited = new boolean[dungeons.length];

        dfs(dungeons, k, 0);

        return maxVisitCount;
    }

    private void dfs(int[][] dungeons, int k, int visitCount) {
        maxVisitCount = Math.max(maxVisitCount, visitCount);

        for (int i = 0; i < dungeons.length; i++) {
            if (canNotExplore(dungeons, k, i)) {
                continue;
            }

            visited[i] = true;
            dfs(dungeons, k - dungeons[i][1], visitCount + 1);
            visited[i] = false;
        }
    }

    private boolean canNotExplore(int[][] dungeons, int k, int index) {
        return visited[index] || dungeons[index][0] > k;
    }
}
