package programmers.q43164;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    private boolean[] visit;
    private StringBuilder sb;
    private List<String> paths = new ArrayList<>();

    public String[] solution(String[][] tickets) {
        for (int i = 0; i < tickets.length; i++) {
            visit = new boolean[tickets.length];

            if (tickets[i][0].equals("ICN")) {
                sb = new StringBuilder();
                sb.append(tickets[i][0]).append(",");
                visit[i] = true;
                dfs(tickets, tickets[i][1], 1);
            }
        }

        Collections.sort(paths);
        return paths.get(0).split(",");
    }

    private void dfs(String[][] tickets, String end, int count) {
        sb.append(end).append(",");

        if (count == tickets.length) {
            paths.add(sb.toString());
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals(end) && !visit[i]) {
                visit[i] = true;
                dfs(tickets, tickets[i][1], count + 1);
                // 백 트래킹
                visit[i] = false;
                sb.delete(sb.length() - 4, sb.length()); // len - 4 부터 len 까지 삭제
            }
        }
    }
}
