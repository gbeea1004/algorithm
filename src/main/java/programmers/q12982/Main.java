package programmers.q12982;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] d = {2,2,3,3};
        int budget = 10;
        System.out.println(solution.solution(d, budget));
    }
}

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        int total = 0;
        for (int i : d) {
            total += i;
            if (total > budget) {
                break;
            }
            answer++;
        }
        return answer;
    }
}
