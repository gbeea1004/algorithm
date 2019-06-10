package codility.step2;

public class Solution {
    public int solution(int[] A) {
        int result = 0;
        for (int i : A) {
            result ^= i;
        }
        return result;
    }
}
