package codesignal.alternation_sums;

public class Solution {
    int[] alternatingSums(int[] a) {
        int[] result = new int[2];
        int index = 0;
        for (int no : a) {
            result[index] += no;
            index = (index + 1) % 2;
        }
        return result;
    }
}
