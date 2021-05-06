package codesignal.intro12;

import java.util.Arrays;

public class Solution {
    int[] sortByHeight(int[] a) {
        int[] treelessNumbers = Arrays.stream(a).filter(n -> n != -1).toArray();
        Arrays.sort(treelessNumbers);
        int indexOfTreelessNumbers = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                a[i] = treelessNumbers[indexOfTreelessNumbers++];
            }
        }
        return a;
    }
}
