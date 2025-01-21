package programmers.q42746;

import java.util.Arrays;

public class Solution {

    public String solution(int[] numbers) {
        String[] numberTexts = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(numberTexts, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (numberTexts[0].equals("0")) {
            return "0";
        }
        String result = "";
        for (String numberText : numberTexts) {
            result += numberText;
        }
        return result;
    }
}
