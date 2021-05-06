package codesignal.intro17;

public class Solution {
    int arrayChange(int[] inputArray) {
        int count = 0;
        int preNo = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] <= preNo) {
                count += preNo + 1 - inputArray[i];
                preNo++;
            } else {
                preNo = inputArray[i];
            }
        }
        return count;
    }
}
