package programmers.q12933;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public long solution(long n) {
        String[] numbers = String.valueOf(n).split("");
        Arrays.sort(numbers, Comparator.reverseOrder());

        StringBuilder answer = new StringBuilder();
        for (String number : numbers) {
            answer.append(number);
        }

        return Long.parseLong(answer.toString());
    }
}
