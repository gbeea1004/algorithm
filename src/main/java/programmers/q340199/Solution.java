package programmers.q340199;

import java.util.Arrays;

public class Solution {

    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        Arrays.sort(wallet);
        Arrays.sort(bill);

        while (true) {
            if (wallet[0] >= bill[0] && wallet[1] >= bill[1]) {
                return answer;
            }

            bill[1] /= 2;
            Arrays.sort(bill);

            answer++;
        }
    }
}
