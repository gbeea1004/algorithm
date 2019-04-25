package programmers.q1845;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{3, 1, 2, 3}));
    }
}

class Solution {
    public int solution(int[] nums) {
        Set<Integer> phoneCatMon = new HashSet<>();
        for (int num : nums) {
            phoneCatMon.add(num);
        }
        int size = nums.length / 2;
        if (phoneCatMon.size() > size) {
            return size;
        }
        return phoneCatMon.size();
    }
}
