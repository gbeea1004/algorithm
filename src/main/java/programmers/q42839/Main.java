package programmers.q42839;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("011"));
    }
}

class Solution {
    private static Map<Integer, Integer> sosus = new HashMap<>();

    public int solution(String numbers) {
        int[] nums = new int[numbers.length()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numbers.charAt(i) - '0';
        }

        for (int i = 1; i <= nums.length; i++) {
            permutation(nums, 0, i);
        }
        return sosus.size();
    }

    private void permutation(int[] nums, int index, int selectNum) {
        if (index == selectNum) {
            isSosu(makeIntNo(nums, selectNum));
        } else {
            for (int i = index; i < nums.length; i++) {
                swap(nums, index, i);
                permutation(nums, index + 1, selectNum);
                swap(nums, index, i);
            }
        }
    }

    private int makeIntNo(int[] nums, int selectNum) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < selectNum; i++) {
            sb.append(nums[i]);
        }
        return Integer.parseInt(sb.toString());
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    private void isSosu(int no) {
        if (no == 0 || no == 1) {
            return;
        }
        for (int i = 2; i <= no / 2; i++) {
            if (no % i == 0) {
                return;
            }
        }
        sosus.put(no, no);
    }
}
