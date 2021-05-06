package codesignal.intro22;

public class Solution {
    int avoidObstacles(int[] inputArray) {
        int minimumJump = 2;
        boolean isFinish = true;
        while (isFinish) {
            isFinish = false;
            for (int index : inputArray) {
                if (index % minimumJump == 0) {
                    minimumJump++;
                    isFinish = true;
                    break;
                }
            }
        }
        return minimumJump;
    }
}
