package programmers.q250121;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        return Arrays.stream(data)
                .filter(row -> row[map.get(ext)] < val_ext)
                .sorted(new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        return o1[map.get(sort_by)] - o2[map.get(sort_by)];
                    }
                })
                .toArray(int[][]::new);
    }
}
