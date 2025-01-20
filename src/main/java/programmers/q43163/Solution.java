package programmers.q43163;

public class Solution {

    private boolean[] visited;
    private int answer;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        answer = 0;

        dfs(begin, target, words, 0);

        return answer;
    }

    private void dfs(String begin, String target, String[] words, int count) {
        if (begin.equals(target)) {
            if (answer == 0) {
                answer = count;
                return;
            }
            answer = Math.min(answer, count);
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue;
            }

            String word = words[i];
            int notEqualCount = 0;
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) != word.charAt(j)) {
                    notEqualCount++;
                }
            }

            if (notEqualCount != 1) {
                continue;
            }

            visited[i] = true;
            dfs(word, target, words, count + 1);
            visited[i] = false;
        }
    }
}
