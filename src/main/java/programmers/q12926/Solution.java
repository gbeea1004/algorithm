package programmers.q12926;

public class Solution {

    private static final int UPPER_ALPHABET_START_NO = 65;
    private static final int UPPER_ALPHABET_END_NO = 90;
    private static final int LOWER_ALPHABET_START_NO = 97;
    private static final int LOWER_ALPHABET_END_NO = 122;
    private static final char BLANK = ' ';
    private static final int RESET_NO = 26;

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            answer.append(toCryptogram(s.charAt(i), n));
        }

        return answer.toString();
    }

    private String toCryptogram(char text, int n) {
        if (text == BLANK) {
            return " ";
        }
        int no = text + n;
        if (UPPER_ALPHABET_START_NO <= text && text <= UPPER_ALPHABET_END_NO) {
            if (no > UPPER_ALPHABET_END_NO) {
                no -= RESET_NO;
            }
            return String.valueOf((char) no);
        }
        if (LOWER_ALPHABET_START_NO <= text && text <= LOWER_ALPHABET_END_NO) {
            if (no > LOWER_ALPHABET_END_NO) {
                no -= RESET_NO;
            }
            return String.valueOf((char) no);
        }
        throw new IllegalArgumentException("잘못된 문자가 있습니다.");
    }
}
