package programmers.q86491;

import java.util.Arrays;

public class Solution {

    public int solution(int[][] sizes) {
        for (int[] size : sizes) {
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);

            size[0] = max;
            size[1] = min;
        }

        int a = Arrays.stream(sizes).mapToInt(x -> x[0]).max().getAsInt();
        int b = Arrays.stream(sizes).mapToInt(x -> x[1]).max().getAsInt();

        return a * b;
    }
}
