package programmers.q12941;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        System.out.println(solution.solution(A, B));
    }
}

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        List<Integer> b = new ArrayList<>();
        for (int i : B) {
            b.add(i);
        }
        Collections.sort(b);
        Collections.reverse(b);

        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * b.get(i);
        }
        return answer;
    }
}
