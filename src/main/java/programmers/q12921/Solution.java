package programmers.q12921;

public class Solution {

    private boolean[] visit;

    public int solution(int n) {
        visit = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (visit[i]) {
                continue;
            }

            for (int j = i * 2; j <= n; j += i) {
                visit[j] = true;
            }
        }

        int answer = 0;
        for (int i = 2; i < visit.length; i++) {
            if (!visit[i]) {
                answer++;
            }
        }

        return answer;
    }
}
