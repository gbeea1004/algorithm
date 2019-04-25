package programmers.q12981;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(Arrays.toString(solution.solution(3, words)));
    }
}

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;
        Map<String, Game> endToEnd = new HashMap<>();
        endToEnd.put(words[0], new Game(1, 1));
        char lastAlphabet = words[0].charAt(words[0].length() - 1);
        for (int i = 1; i < words.length; i++) {
            String current = words[i];
            // 정상적인 경우
            if (endToEnd.get(current) == null && lastAlphabet == current.charAt(0)) {
                endToEnd.put(current, new Game((i % n) + 1, (i / n) + 1));
                lastAlphabet = current.charAt(words[i].length() - 1);
                continue;
            }

            // 탈락인 경우
            answer[0] = (i % n) + 1;
            answer[1] = (i / n) + 1;
            return answer;
        }
        return answer;
    }
}

class Game {
    int person;
    int round;

    public Game(int person, int round) {
        this.person = person;
        this.round = round;
    }

    public int getPerson() {
        return person;
    }

    public int getRound() {
        return round;
    }
}