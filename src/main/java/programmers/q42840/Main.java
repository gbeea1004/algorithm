package programmers.q42840;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, / 1, 2, 3, 4, 5, ...
    // 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5,/ 2, 1, 2, 3, 2, 4, 2, 5, ...
    // 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5,/ 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] answers = {1,3,2,4,2};
        solution.solution(answers);
    }
}

class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = {0, 0, 0};
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            int rightAnswer = answers[i];
            if (rightAnswer == student1[i  % 5]) {
                count[0] += 1;
            }
            if (rightAnswer == student2[i  % 8]) {
                count[1] += 1;
            }
            if (rightAnswer == student3[i  % 10]) {
                count[2] += 1;
            }
        }
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        for (int i = 0; i < count.length; i++) {
            if (max == count[i]) {
                result.add(i + 1);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
