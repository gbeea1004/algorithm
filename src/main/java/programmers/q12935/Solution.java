package programmers.q12935;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int minNo = Arrays.stream(arr)
                          .min()
                          .getAsInt();
        int[] result = new int[arr.length - 1];
        boolean findMinNo = false;
        int resultIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!findMinNo && arr[i] == minNo) {
                findMinNo = true;
                continue;
            }
            result[resultIndex++] = arr[i];
        }
        return result;
    }
}
