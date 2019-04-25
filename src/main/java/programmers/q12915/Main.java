package programmers.q12915;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 1;
        System.out.println(Arrays.toString(solution.solution(strings, n)));
    }
}

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int corrent = o1.charAt(n) - o2.charAt(n);
                if (corrent == 0) {
                    return o1.compareTo(o2);
                }
                return corrent;
            }
        });

        return strings;
    }
}