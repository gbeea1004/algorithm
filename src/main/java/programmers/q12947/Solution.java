package programmers.q12947;

import java.util.Arrays;

public class Solution {
    public boolean solution(int x) {
        int sum = Arrays.stream(String.valueOf(x).split(""))
                        .mapToInt(Integer::parseInt)
                        .sum();

        return x % sum == 0;
    }
}
