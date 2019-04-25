package programmers.q12939;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "1 2 3 4";
        System.out.println(solution.solution(s));
    }
}

class Solution {
    public String solution(String s) {
        String[] input = s.split(" ");
        int[] convert = new int[input.length];
        int no = 0;
        for (String e : input) {
            convert[no++] = Integer.parseInt(e);
        }
        Arrays.sort(convert);
        return convert[0] + " " + convert[convert.length - 1];
    }
}