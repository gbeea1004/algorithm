package codesignal.intro28;

public class Solution {
    String alphabeticShift(String inputString) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char current = inputString.charAt(i);
            if (current == 'z') {
                result.append('a');
                continue;
            }
            result.append((char)((int)current + 1));
        }

        return result.toString();
    }
}
