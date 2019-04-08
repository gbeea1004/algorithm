package programmers.q43104;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(6));
    }
}

class Solution {
    public long solution(int N) {
        List<Integer> no = new ArrayList<>();
        no.add(1);
        no.add(1);

        for (int i = 2; i < N; i++) {
            no.add(no.get(i-1) + no.get(i-2));
        }
        int currentNo = no.get(no.size() - 1);
        int preNo = no.get(no.size() - 2);
        return ((currentNo + preNo) + (preNo + no.get(no.size() - 3))) * 2;
    }
}