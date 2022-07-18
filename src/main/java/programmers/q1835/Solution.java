package programmers.q1835;

public class Solution {

    private static final String[] FRIENDS = {"A", "C", "F", "J", "M", "N", "R", "T"};
    private static final char MORE_THEN = '>';
    private static final char LESS_THEN = '<';
    private static final char IS_EQUAL = '=';
    private int answer;

    public int solution(int n, String[] data) {
        boolean[] visited = new boolean[FRIENDS.length];
        answer = 0;
        dfs("", visited, data);
        return answer;
    }

    private void dfs(String names, boolean[] visited, String[] data) {
        if (names.length() == 7) {
            if (isValid(names, data)) {
                answer++;
            }
            return;
        }
        // 조합
        for (int i = 0; i < FRIENDS.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            dfs(names + FRIENDS[i], visited, data);
            visited[i] = false;
        }
    }

    private boolean isValid(String names, String[] data) {
        for (String condition : data) {
            char operation = condition.charAt(3);
            int posDiff = Math.abs(names.indexOf(condition.charAt(0)) - names.indexOf(condition.charAt(2)));
            int dir = (condition.charAt(4) - '0') + 1;

            if (operation == IS_EQUAL && !(posDiff == dir)) {
                return false;
            }
            if (operation == MORE_THEN && !(posDiff > dir)) {
                return false;
            }
            if (operation == LESS_THEN && !(posDiff < dir)) {
                return false;
            }
        }
        return true;
    }
}
