package programmers.q120837;

public class Solution {

    private static final int GENERAL_ANT_DAMAGE = 5;
    private static final int SOLDIER_ANT_DAMAGE = 3;

    public int solution(int hp) {
        int answer = 0;

        answer += hp / GENERAL_ANT_DAMAGE;
        hp %= GENERAL_ANT_DAMAGE;
        answer += hp / SOLDIER_ANT_DAMAGE;
        hp %= SOLDIER_ANT_DAMAGE;
        answer += hp;

        return answer;
    }
}
