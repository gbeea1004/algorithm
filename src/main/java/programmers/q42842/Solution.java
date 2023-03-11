package programmers.q42842;

public class Solution {

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        for (int row = 3; row <= sum; row++) {
            int column = sum / row;
            if (column < 3) {
                continue;
            }

            if (!isDivisor(sum, row)) {
                continue;
            }

            int big = Math.max(row, column);
            int small = Math.min(row, column);
            int yellowCount = (big - 2) * (small - 2);
            if (yellowCount == yellow) {
                answer[0] = big;
                answer[1] = small;
                return answer;
            }
        }

        throw new RuntimeException("값을 구할 수 없음");
    }

    private boolean isDivisor(int no, int targetNo) {
        return no % targetNo == 0;
    }
}
