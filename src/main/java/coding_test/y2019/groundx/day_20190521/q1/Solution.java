package coding_test.y2019.groundx.day_20190521.q1;

public class Solution {
    public int solution(int[] v) {
        int answer = 0;
        int accumulate = 1; // 누적
        for (int i = 0; i < v.length; i++) {
            // 맞추지 못하였을 때
            if (v[i] == 0) {
                accumulate = 1;
                continue;
            }
            // 맞추었을 때
            answer += ((i + 1) * accumulate);
            accumulate++;
        }
        return answer;
    }
}
