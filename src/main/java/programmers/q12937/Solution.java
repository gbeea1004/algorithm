package programmers.q12937;

public class Solution {

    private static final String ODD = "Odd";
    private static final String EVEN = "Even";

    public String solution(int num) {
        return num % 2 == 0 ? EVEN : ODD;
    }
}
