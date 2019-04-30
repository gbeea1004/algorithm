package programmers.q42576;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] participant = {"base", "base", "b"};
        String[] completion = {"base"};
        System.out.println(solution.solution(participant, completion));
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        StringBuilder answer = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        for (String person : participant) {
            if (map.get(person) == null) {
                map.put(person, 1);
            } else {
                map.put(person, map.get(person) + 1);
            }
        }

        for (String person : completion) {
            map.put(person, map.get(person) - 1);
        }

        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                answer.append(s);
            }
        }
        return answer.toString();
    }
}
