package programmers.q12915;

import java.util.Arrays;

public class Solution {

    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
                     .sorted((o1, o2) -> {
                         int diff = o1.charAt(n) - o2.charAt(n);
                         if (diff == 0) {
                             return o1.compareTo(o2);
                         }
                         return diff;
                     })
                     .toArray(String[]::new);
    }
}
