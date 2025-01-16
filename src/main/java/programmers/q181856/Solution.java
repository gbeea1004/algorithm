package programmers.q181856;

import java.util.Arrays;

public class Solution {

    public static final int FIRST_IS_BIGGER = 1;
    public static final int SECOND_IS_BIGGER = -1;
    public static final int SAME = 0;

    public int solution(int[] arr1, int[] arr2) {
        int firstSize = arr1.length;
        int secondSize = arr2.length;

        if (firstSize > secondSize) {
            return FIRST_IS_BIGGER;
        }
        if (firstSize < secondSize) {
            return SECOND_IS_BIGGER;
        }

        int firstSum = Arrays.stream(arr1).sum();
        int secondSum = Arrays.stream(arr2).sum();
        
        if (firstSum > secondSum) {
            return FIRST_IS_BIGGER;
        }
        if (firstSum < secondSum) {
            return SECOND_IS_BIGGER;
        }
        
        return SAME;
    }
}
