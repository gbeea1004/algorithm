package codility.binary_gap;

public class Solution {
    public int solution(int N) {
        String binaryNo = Integer.toBinaryString(N);
        int max = 0;
        int checker = 0;
        for (int i = 0; i < binaryNo.length(); i++) {
            if (binaryNo.charAt(i) == '1') {
                max = Math.max(max, checker);
                checker = 0;
            } else {
                checker++;
            }
        }
        return max;
    }
}
