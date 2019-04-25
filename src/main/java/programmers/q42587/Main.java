package programmers.q42587;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] priorities = {3, 1, 4, 2};
        int location = 1;
        System.out.println(solution.solution(priorities, location));

    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> documents = new LinkedList<>();
        for (int priority : priorities) {
            documents.offer(priority);
        }

        while (!documents.isEmpty()) {
            int current = documents.poll();
            boolean check = true;
            for (Integer document : documents) {
                if (current < document) {
                    check = false;
                    break;
                }
            }

            if (check) {
                answer++;
                if (location == 0) {
                    return answer;
                }
            } else {
                documents.offer(current);
            }
            location--;
            if (location < 0) {
                location += documents.size();
            }
        }
        return -1; // 에러일 경우
    }
}