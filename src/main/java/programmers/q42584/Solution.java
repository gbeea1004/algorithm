package programmers.q42584;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] solution(int[] prices) {
        List<Integer> result = new ArrayList<>();
        int length = prices.length;

        for (int i = 0; i < length; i++) {
            int initPrice = prices[i];
            int time = 0;
            for (int j = i + 1; j < length; j++) {
                time++;
                if (initPrice > prices[j]) {
                    break;
                }
            }
            result.add(time);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
