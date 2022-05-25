package programmers.q12917;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public String solution(String s) {
        String[] texts = s.split("");
        Arrays.sort(texts, Comparator.reverseOrder());

        StringBuilder answer = new StringBuilder();
        Arrays.stream(texts).forEach(answer::append);

        return answer.toString();
    }
}
