package coding_test.y2019.zoom.q1;

public class Solution {
    public int solution(int inner, int outer, int[] points_x, int[] points_y) {
        int count = 0;
        for (int i = 0; i < points_x.length; i++) {
            int x = points_x[i];
            int y = points_y[i];

            // 초기 체크
            if ((0 == x && inner == y) || (-inner == x && 0 == y) || (0 == x && -inner == y) || (inner == x && 0 == y)
                    || (0 == x && outer == y) || (-outer == x && 0 == y) || (0 == x && -outer == y) || (outer == x && 0 == y)) {
                break;
            }

            // 1사분면 체크
            if (inner <= x && outer >= x && inner <= y && outer >= y) {
                count++;
                continue;
            }

            // 2사분면 체크
            if (-inner >= x && -outer <= x && inner <= y && outer >= y) {
                count++;
                continue;
            }

            // 3사분면 체크
            if (-inner >= x && -outer <= x && -inner >= y && -outer <= y) {
                count++;
                continue;
            }

            // 4사분면 체크
            if (inner <= x && outer >= x && -inner >= y && -outer <= y) {
                count++;
            }
        }
        return count;
    }
}
