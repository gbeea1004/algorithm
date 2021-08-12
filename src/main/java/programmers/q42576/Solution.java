package programmers.q42576;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String name : participant) {
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
                continue;
            }
            map.put(name, 1);
        }

        for (String name : completion) {
            map.put(name, map.get(name) - 1);
            if (map.get(name) == 0) {
                map.remove(name);
            }
        }

        String answer = "";
        for (String name : map.keySet()) {
            answer = name;
        }
        return answer;
    }
}
