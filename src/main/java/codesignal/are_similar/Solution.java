package codesignal.are_similar;

public class Solution {
    boolean areSimilar(int[] a, int[] b) {
        int swapCount = 0;
        boolean[] visit = new boolean[b.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                boolean find = false;
                for (int j = 0; j < b.length; j++) {
                    if (!visit[j] && i != j && a[j] != b[j] && b[j] == a[i]) {
                        int temp = b[j];
                        b[j] = b[i];
                        b[i] = temp;
                        swapCount++;
                        find = true;
                        break;
                    }
                }
                if (!find) {
                    return false;
                }
            }

            if (swapCount >= 2) {
                return false;
            }
            visit[i] = true;
        }
        return true;
    }
}
