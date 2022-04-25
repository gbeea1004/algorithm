package programmers.q12982;

import java.util.Arrays;

public class Solution {

    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        int sum = 0;
        for (int money : d) {
            sum += money;
            if (sum > budget) {
                break;
            }
            answer++;
        }
        return answer;
    }
}
