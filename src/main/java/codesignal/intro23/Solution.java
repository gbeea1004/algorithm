package codesignal.intro23;

public class Solution {
    int[][] boxBlur(int[][] image) {
        int[][] result = new int[image.length - 2][image[0].length - 2];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                int sum = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        sum += image[k][l];
                    }
                }
                result[i][j] = sum / 9;
            }
        }
        return result;
    }
}
