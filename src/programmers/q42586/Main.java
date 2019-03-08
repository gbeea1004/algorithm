package programmers.q42586;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(solution.solution(progresses, speeds)));
    }
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] time = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            int no = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] == 0) {
                time[i] = no;
                continue;
            }
            time[i] = no + 1;
        }

        Stack stack = new Stack();
        List<Integer> result = new ArrayList<>();
        stack.push(time[0]);
        int no = 1;

        for (int i = 1; i < time.length; i++) {
            if ((int) stack.peek() >= time[i]) {
                no++;
            } else {
                stack.pop();
                result.add(no);
                stack.push(time[i]);
                no = 1;
            }
            if (i == time.length - 1 && no >= 1) {
                result.add(no);
            }
        }


        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}