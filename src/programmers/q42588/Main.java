package programmers.q42588;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[]{6, 9, 5, 7, 4})));
    }
}

class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        answer[0] = 0;

        for (int i = 1; i < heights.length; i++) {
            int index = i;
            while (index > 0) {
                if (heights[index-1] > heights[i]) {
                    answer[i] = index;
                    break;
                }
                index--;
            }
        }
        return answer;
    }
}
