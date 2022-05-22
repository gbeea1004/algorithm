package programmers.q12906;

import java.util.*;

public class Solution {

    public Integer[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int currentNo = -1;

        for (int no : arr) {
            if (currentNo == no) {
                continue;
            }
            result.add(no);
            currentNo = no;
        }

        return result.toArray(new Integer[0]);
    }
}
