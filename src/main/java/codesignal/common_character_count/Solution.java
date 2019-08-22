package codesignal.common_character_count;

public class Solution {
    int commonCharacterCount(String s1, String s2) {
        String big;
        String small;
        int result = 0;

        if (s1.length() >= s2.length()) {
            big = s1;
            small = s2;
        } else {
            big = s2;
            small = s1;
        }

        for (int i = 0; i < small.length(); i++) {
            if (big.contains(Character.toString(small.charAt(i)))) {
                big = big.replaceFirst(Character.toString(small.charAt(i)), "_");
                result++;
            }
        }
        return result;
    }
}
