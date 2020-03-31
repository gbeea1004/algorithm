package coding_test.y2020.est.q1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int solution(int[] A) {
        TreeMap<Integer, Integer> values = toTreeMap(createValues(A));
        for (Integer value : values.descendingKeySet()) {
            if (value.equals(values.get(value))) {
                return value;
            }
        }
        return 0;
    }

    private TreeMap<Integer, Integer> toTreeMap(Map<Integer, Integer> values) {
        return new TreeMap<>(values);
    }

    private Map<Integer, Integer> createValues(int[] A) {
        Map<Integer, Integer> values = new HashMap<>();
        for (int value : A) {
            if (!values.containsKey(value)) {
                values.put(value, 1);
            } else {
                values.put(value, values.get(value) + 1);
            }
        }
        return values;
    }
}
