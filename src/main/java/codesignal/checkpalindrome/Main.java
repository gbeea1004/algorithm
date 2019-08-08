package codesignal.checkpalindrome;

public class Main {
    boolean checkPalindrome(String inputString) {
        int size = inputString.length();

        if (size == 1) {
            return true;
        }

        for (int i = 0; i < size / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
