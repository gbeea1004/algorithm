package programmers.q12931;

import java.util.Arrays;

public class Solution {

    public int solution(int n) {
        String[] numbers = String.valueOf(n).split("");

        return Arrays.stream(numbers)
                     .mapToInt(Integer::parseInt)
                     .sum();
    }
}
