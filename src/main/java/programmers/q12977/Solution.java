package programmers.q12977;

public class Solution {

    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int num2 = nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    int num3 = nums[k];
                    if (isSosu(num1 + num2 + num3)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean isSosu(int no) {
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                return false;
            }
        }
        return true;
    }
}
