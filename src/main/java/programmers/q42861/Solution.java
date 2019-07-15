package programmers.q42861;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int solution(int n, int[][] costs) {
        Arrays.sort(costs, Comparator.comparingInt((int[] o) -> o[2]));
        boolean[] check = new boolean[costs.length];
        boolean[] visit = new boolean[n];

        visit[costs[0][0]] = true;
        visit[costs[0][1]] = true;
        check[0] = true;
        int answer = costs[0][2];
        int complete = 2;

        while (complete < n) {
            for (int i = 1; i < check.length; i++) {
                if (!check[i] && ((visit[costs[i][0]] && !visit[costs[i][1]]) || (visit[costs[i][1]] && !visit[costs[i][0]]))) {
                    check[i] = true;
                    visit[costs[i][0]] = true;
                    visit[costs[i][1]] = true;
                    complete++;
                    answer += costs[i][2];
                    break;
                }

            }
        }
        return answer;
    }
}
