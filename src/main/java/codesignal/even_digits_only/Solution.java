package codesignal.even_digits_only;

public class Solution {
    boolean evenDigitsOnly(int n) {
        return isEven(intToString(n));
    }

    private String intToString(int no) {
        return String.valueOf(no);
    }

    private boolean isEven(String numbers) {
        for (int i = 0; i < numbers.length(); i++) {
            if (isOdd(charToInt(numbers.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    private int charToInt(char no) {
        return no - '0';
    }

    private boolean isOdd(int no) {
        return no % 2 != 0;
    }
}
