package codesignal.array_maximal_adjacent_difference;

public class Solution {
    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int maxDifference = 0;

        for (int i = 0; i < inputArray.length - 1; i++) {
            int big = Math.max(inputArray[i], inputArray[i + 1]);
            int small = Math.min(inputArray[i], inputArray[i + 1]);
            maxDifference = Math.max(maxDifference, big - small);
        }
        return maxDifference;
    }
}
