package codesignal.intro18;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    boolean palindromeRearranging(String inputString) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (map.get(inputString.charAt(i)) == null) {
                map.put(inputString.charAt(i), 1);
            } else {
                map.put(inputString.charAt(i), map.get(inputString.charAt(i)) + 1);
            }
        }

        int count = 0;
        for (Integer value : map.values()) {
            count += value % 2;
        }
        return count == 0 || count == 1;
    }
}
