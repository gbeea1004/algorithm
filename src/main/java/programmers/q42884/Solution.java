package programmers.q42884;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
        Arrays.sort(routes, Comparator.comparingInt(o -> o[1]));
        int end = routes[0][1];
        for (int i = 1; i < routes.length; i++) {
            if (routes[i][0] > end) {
                end = routes[i][1];
                answer++;
                continue;
            }
            end = Math.min(routes[i][1], end);
        }
        return answer;
    }
}