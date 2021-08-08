package programmers.q42862;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> losts = new ArrayList<>();
        List<Integer> reserves = new ArrayList<>();

        for (Integer lostNumber : lost) {
            losts.add(lostNumber);
        }
        for (Integer reserveNumber : reserve) {
            reserves.add(reserveNumber);
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    losts.remove(Integer.valueOf(lost[i]));
                    reserves.remove(Integer.valueOf(lost[i]));
                }
            }
        }

        Collections.sort(losts);
        Collections.sort(reserves);

        int answer = n - losts.size();
        boolean[] reserveVisit = new boolean[reserves.size()];

        for (Integer lostStudent : losts) {
            for (int i = 0; i < reserves.size(); i++) {
                int reserveNumber = reserves.get(i);
                if ((reserveNumber - 1 == lostStudent || reserveNumber + 1 == lostStudent) && !reserveVisit[i]) {
                    answer++;
                    reserveVisit[i] = true;
                    break;
                }
            }
        }
        return answer;
    }
}
