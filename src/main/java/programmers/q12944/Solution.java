package programmers.q12944;

import java.util.Arrays;

public class Solution {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}
