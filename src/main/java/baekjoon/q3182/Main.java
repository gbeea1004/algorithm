package baekjoon.q3182;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        int[] answers = new int[n];

        for (int i = 0; i < n; i++) {
            answers[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(new Solution().solution(answers));

        br.close();
    }
}

class Solution {

    private int[] answers;
    private int[] results;

    public int solution(int[] answers) {
        this.answers = answers;
        results = new int[answers.length];
        int resultAnswerNo = 0;
        int maxAnswer = 0;

        for (int i = 0; i < answers.length; i++) {
            bfs(i);
        }

        for (int i = results.length - 1; i >= 0; i--) {
            if (results[i] >= maxAnswer) {
                maxAnswer = results[i];
                resultAnswerNo = i + 1;
            }
        }

        return resultAnswerNo;
    }

    private void bfs(int startIndex) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visit = new boolean[answers.length];

        queue.add(startIndex);
        visit[startIndex] = true;

        while (!queue.isEmpty()) {
            Integer currentIndex = queue.poll();
            int nextIndex = answers[currentIndex] - 1;

            if (visit[nextIndex]) {
                continue;
            }

            visit[nextIndex] = true;
            queue.add(nextIndex);
            results[startIndex]++;
        }
    }
}