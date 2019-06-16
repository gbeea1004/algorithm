package programmers.q12946;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<int[]> answer = new ArrayList<>();

    public int[][] solution(int n) {
        hanoi(n, 1, 2, 3);
        int[][] result = new int[answer.size()][2];
        for (int i = 0; i < answer.size(); i++) {
            result[i][0] = answer.get(i)[0];
            result[i][1] = answer.get(i)[1];
        }
        return result;
    }

    private void hanoi(int num, int from, int by, int to) {
        if (num == 1) {
            answer.add(new int[]{from, to});
        } else {
            hanoi(num - 1, from, to, by);
            answer.add(new int[]{from, to});
            hanoi(num - 1, by, from, to);
        }
    }
}
