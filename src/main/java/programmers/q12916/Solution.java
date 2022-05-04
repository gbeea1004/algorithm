package programmers.q12916;

public class Solution {

    public boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (isP(current)) {
                pCount++;
                continue;
            }
            if (isY(current)) {
                yCount++;
            }
        }

        return pCount == yCount;
    }

    private boolean isP(char alphabet) {
        return alphabet == 'p' || alphabet == 'P';
    }

    private boolean isY(char alphabet) {
        return alphabet == 'y' || alphabet == 'Y';
    }
}
