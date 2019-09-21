package codesignal.variable_name;

public class Solution {
    boolean variableName(String name) {
        if (48 <= name.charAt(0) && name.charAt(0) <= 57) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            char current = name.charAt(i);
            if (48 <= current && current <= 57) {
                continue;
            }

            if (current == 95) {
                continue;
            }

            if ((65 <= current && current <= 90) || (97 <= current && current <= 122)) {
                continue;
            }
            return false;
        }
        return true;
    }
}
