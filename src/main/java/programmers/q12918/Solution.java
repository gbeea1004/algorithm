package programmers.q12918;

public class Solution {

    private static final int MIN_NUMBER = 48;
    private static final int MAX_NUMBER = 57;

    public boolean solution(String s) {
        int textSize = s.length();
        if (textSize != 4 && textSize != 6) {
            return false;
        }
        for (int i = 0; i < textSize; i++) {
            char text = s.charAt(i);
            if (text < MIN_NUMBER || MAX_NUMBER < text) {
                return false;
            }
        }
        return true;
    }
}
