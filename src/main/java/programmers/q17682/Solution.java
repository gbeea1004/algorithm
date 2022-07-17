package programmers.q17682;

import java.util.Arrays;

public class Solution {

    public int solution(String dartResult) {
        String[] dartResults = toSplitText(dartResult);
        int[] sums = new int[dartResults.length];

        for (int i = 0; i < dartResults.length; i++) {
            String[] words = dartResults[i].split(" ");
            sums[i] = calculate(words);
            if (words.length == 3) {
                if (words[2].equals("*")) {
                    sums[i] = sums[i] * 2;
                    if (i != 0) {
                        sums[i - 1] = sums[i - 1] * 2;
                    }
                    continue;
                }
                if (words[2].equals("#")) {
                    sums[i] = -sums[i];
                    continue;
                }
                throw new IllegalArgumentException("존재하지 않는 옵션입니다.");
            }
        }

        return Arrays.stream(sums)
                     .sum();
    }

    private int calculate(String[] words) {
        int score = Integer.parseInt(words[0]);
        String bonus = words[1];
        if (bonus.equals("S")) {
            return score;
        }
        if (bonus.equals("D")) {
            return (int) Math.pow(score, 2);
        }
        if (bonus.equals("T")) {
            return (int) Math.pow(score, 3);
        }
        throw new IllegalArgumentException("존재하지 않는 보너스입니다.");
    }

    private String[] toSplitText(String dartResult) {
        StringBuilder sb = new StringBuilder();
        sb.append(dartResult.charAt(0));
        int startIndex = 1;
        if (isNumber(dartResult.charAt(1))) {
            sb.append(dartResult.charAt(1));
            startIndex = 2;
        }
        sb.append(" ");
        for (int i = startIndex; i < dartResult.length(); i++) {
            char word = dartResult.charAt(i);
            if (isNumber(word)) {
                sb.append("/");
                sb.append(word);
                if (i + 1 < dartResult.length() && isNumber(dartResult.charAt(i + 1))) {
                    sb.append(dartResult.charAt(i + 1));
                    i++;
                }
            } else {
                sb.append(word);
            }
            sb.append(" ");
        }
        return sb.toString().split("/");
    }

    private boolean isNumber(char word) {
        return 48 <= word && word <= 57;
    }
}
