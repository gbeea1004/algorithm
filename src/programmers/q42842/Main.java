package programmers.q42842;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(10, 2)));
    }
}

class Solution {
    public int[] solution(int brown, int red) {
        int width = brown + red;
        List<Integer> hv = new ArrayList<>();
        int[] answer = new int[2];
        for (int i = 3; i <= width / 2; i++) {
            if (width % i == 0) {
                int mok = width / i;
                if ((mok - 2) * (i - 2) == red) {
                    hv.add(mok);
                    hv.add(i);
                    break;
                }
            }
        }

        for (int i = 0; i < hv.size(); i++) {
            answer[i] = hv.get(i);
        }

        return answer;
    }
}
