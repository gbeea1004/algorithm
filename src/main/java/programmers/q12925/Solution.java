package programmers.q12925;

public class Solution {

    public int solution(String s) {
        char first = s.charAt(0);

        if (first == '+') {
            return Integer.parseInt(s.substring(1));
        }
        if (first == '-') {
            return -Integer.parseInt(s.substring(1));
        }
        return Integer.parseInt(s);
    }
}
