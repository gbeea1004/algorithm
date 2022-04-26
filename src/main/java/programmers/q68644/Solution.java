package programmers.q68644;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public int[] solution(int[] numbers) {
        Arrays.sort(numbers);
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                map.putIfAbsent(numbers[i] + numbers[j], true);
            }
        }

        List<Integer> result = new ArrayList<>(map.keySet());
        Collections.sort(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
