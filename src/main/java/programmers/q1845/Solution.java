package programmers.q1845;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    public int solution(int[] nums) {
        Set<Integer> phoneCatMonKinds = Arrays.stream(nums)
                                              .boxed()
                                              .collect(Collectors.toSet());

        return Math.min(nums.length / 2, phoneCatMonKinds.size());
    }
}
