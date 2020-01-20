package coding_test.y2019.eleven.q1;

public class Solution {
    public int[] solution(int N) {
        int[] answer = new int[2];
        int maxJinSu = 0;
        int maxValue = 0;

        // 2 ~ 9 진법 체크
        for (int i = 2; i < 10; i++) {
            int no = N;
            int value = 1;
            while (no != 0) {
                int currentNo = no % i;
                if (currentNo != 0) {
                    value *= currentNo;
                }
                no /= i;
            }

            if (maxValue <= value) {
                maxJinSu = i;
                maxValue = value;
            }
        }
        answer[0] = maxJinSu;
        answer[1] = maxValue;
        return answer;
    }
}
