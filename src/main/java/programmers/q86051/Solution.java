package programmers.q86051;

import java.util.stream.IntStream;

public class Solution {

    public int solution(int[] numbers) {
        boolean[] visit = new boolean[10];
        for (int number : numbers) {
            visit[number] = true;
        }

        return IntStream.range(0, visit.length)
                        .filter(i -> !visit[i])
                        .sum();
    }
}
