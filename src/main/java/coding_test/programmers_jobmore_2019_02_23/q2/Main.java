package coding_test.programmers_jobmore_2019_02_23.q2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] people = {2, 3};
        int[] tshirts = {1, 2, 3};
        Solution solution = new Solution();
        System.out.println(solution.solution(people, tshirts));
    }
}

class Solution {
    public int solution(int[] people, int[] tshirts) {
        int answer = 0;
        Arrays.sort(people);
        Arrays.sort(tshirts);
        for (int person : people) {
            for (int i = 0; i < tshirts.length; i++) {
                if (person <= tshirts[i]) {
                    tshirts[i] = -1;
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}