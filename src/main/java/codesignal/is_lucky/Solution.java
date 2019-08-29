package codesignal.is_lucky;

public class Solution {
    boolean isLucky(int n) {
        String number = String.valueOf(n);
        int halfLen = number.length() / 2;
        int a = 0;
        int b = 0;
        for (int i = 0; i < halfLen; i++) {
            a += number.charAt(i) - '0';
            b += number.charAt(number.length() - 1 - i) - '0';
        }
        return a == b;
    }
}
