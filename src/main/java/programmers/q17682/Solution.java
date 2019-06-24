package programmers.q17682;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        List<Integer> no = new ArrayList<>();
        for (int i = 0; i < dartResult.length(); i++) {
            char current = dartResult.charAt(i);
            if (current == 'S') {
                continue;
            }
            if (current == 'D') {
                no.set(no.size() - 1, no.get(no.size() - 1) * no.get(no.size() - 1));
                continue;
            }
            if (current == 'T') {
                no.set(no.size() - 1, no.get(no.size() - 1) * no.get(no.size() - 1) * no.get(no.size() - 1));
                continue;
            }
            if (current == '*') {
                no.set(no.size() - 1, no.get(no.size() - 1) * 2);
                if (no.size() >= 2) {
                    no.set(no.size() - 2, no.get(no.size() - 2) * 2);
                }
                continue;
            }
            if (current == '#') {
                no.set(no.size() - 1, no.get(no.size() - 1) * -1);
                continue;
            }

            if (0 <= dartResult.charAt(i + 1) - '0' && dartResult.charAt(i + 1) - '0' <= 10) {
                no.add(Integer.parseInt(dartResult.substring(i, i + 2)));
                i++;
            } else {
                no.add(Integer.parseInt(dartResult.substring(i, i + 1)));
            }
        }
        for (Integer integer : no) {
            answer += integer;
        }
        return answer;
    }
}
