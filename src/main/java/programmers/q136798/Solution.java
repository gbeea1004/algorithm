package programmers.q136798;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int number, int limit, int power) {
        List<Integer> attackDamages = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            attackDamages.add(getDivisorCount(i));
        }

        int answer = 0;
        for (Integer attackDamage : attackDamages) {
            if (attackDamage > limit) {
                answer += power;
            } else {
                answer += attackDamage;
            }
        }

        return answer;
    }

    private int getDivisorCount(int no) {
        int count = 0;

        for (int i = 1; i * i <= no; i++) {
            if (no % i == 0) {
                count++;
                if (i * i < no) {
                    count++;
                }
            }
        }

        return count;
    }
}
