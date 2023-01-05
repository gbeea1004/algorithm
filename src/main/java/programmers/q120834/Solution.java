package programmers.q120834;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(int age) {
        String answer = "";
        Map<String, String> map = new HashMap<>();
        map.put("0", "a");
        map.put("1", "b");
        map.put("2", "c");
        map.put("3", "d");
        map.put("4", "e");
        map.put("5", "f");
        map.put("6", "g");
        map.put("7", "h");
        map.put("8", "i");
        map.put("9", "j");
        String[] numbers = String.valueOf(age).split("");
        for (String number : numbers) {
            answer += map.get(number);
        }
        return answer;
    }
}
