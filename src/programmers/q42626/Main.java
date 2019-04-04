package programmers.q42626;

import java.util.*;
/*
* 힙 : 데이터를 입력하면 자동으로 우선순위에 따라 정렬해주는 자료구조
* PriorityQueue -> 우선순위가 가장 높은 데이터가 가장 먼저 나온다.
* */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
}

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        Queue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }

        while (!pq.isEmpty()) {
            if (pq.peek() >= K) {
                break;
            }
            if (pq.size() == 1) {
                return -1;
            }
            pq.offer(pq.poll() + (pq.poll() * 2));
            answer++;
        }

        return answer;
    }
}