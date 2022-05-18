package programmers.q12910;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();
        for (int no : arr) {
            if (no % divisor == 0) {
                result.add(no);
            }
        }

        if (result.size() == 0) {
            return new int[]{-1};
        }

        Collections.sort(result);
        return result.stream().mapToInt(no -> no).toArray();
    }
}
