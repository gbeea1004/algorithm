package codesignal.intro21;

public class Solution {
    boolean isIPv4Address(String inputString) {
        if (!inputString.contains(".")) {
            return false;
        }
        String[] numbers = inputString.split("\\.");
        if (numbers.length != 4) {
            return false;
        }
        for (String number : numbers) {
            try {
                int no = Integer.parseInt(number);
                if (no < 0 || no > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}
