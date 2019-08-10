package programmers.q43163;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(String begin, String target, String[] words) {
        // words 에 target 이 있는지 검사
        if (!isTargetWord(target, words)) {
            return 0;
        }

        Queue<Node> nodes = new LinkedList<>();
        boolean[] visit = new boolean[words.length];
        nodes.add(new Node(begin, 0));
        int answer = 0;

        while (!nodes.isEmpty()) {
            Node node = nodes.poll();

            for (int i = 0; i < words.length; i++) {
                // 다음 글자로 넘어갈 수 있는가
                if (!visit[i] && isNext(node.word, words[i])) {
                    if (target.equals(words[i])) {
                        answer = node.count + 1;
                        nodes.clear();
                        break;
                    }
                    nodes.add(new Node(words[i], node.count + 1));
                    visit[i] = true;
                }
            }
        }
        return answer;
    }

    private boolean isNext(String current, String next) {
        int otherCount = 0;
        for (int i = 0; i < next.length(); i++) {
            if (current.charAt(i) != next.charAt(i)) {
                otherCount++;
            }

            if (otherCount > 1) {
                return false;
            }
        }
        return true;
    }

    private boolean isTargetWord(String target, String[] words) {
        return Arrays.asList(words).contains(target);
    }

    class Node {
        private String word;
        private int count;

        public Node(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
}
