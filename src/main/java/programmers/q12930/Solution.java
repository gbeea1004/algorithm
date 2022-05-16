package programmers.q12930;

public class Solution {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isUpper = true;

        for (String word : s.split("")) {
            if (word.equals(" ")) {
                answer.append(word);
                isUpper = true;
                continue;
            }
            if (isUpper) {
                answer.append(word.toUpperCase());
            } else {
                answer.append(word.toLowerCase());
            }
            isUpper = !isUpper;
        }
        return answer.toString();
    }
}
