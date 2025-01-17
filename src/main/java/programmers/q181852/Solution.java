package programmers.q181852;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list).sorted().skip(5).toArray();
    }
}
