package codesignal.intro6;

import java.util.Arrays;

public class Solution {
    int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        int count = 0;
        for (int i = 1; i < statues.length; i++) {
            if (statues[i] - statues[i - 1] != 1) {
                count += (statues[i] - statues[i - 1] - 1);
            }
        }
        return count;
    }
}
