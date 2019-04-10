package programmers.q42629;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
/*
* 다음에 다시 풀어보기
* */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int stock = 4;
        int[] dates = {4, 10, 15};
        int[] supplies = {20, 5, 10};
        int k = 30;
        System.out.println(solution.solution(stock, dates, supplies, k));
    }
}

class Solution {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        Queue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        int answer = 0;
        int index = 0;
        int day = stock;
        while (day < k) {
            while (index < dates.length && dates[index] <= day) {
                pq.add(supplies[index]);
                index++;
            }
            answer++;
            day += pq.poll();
        }
        return answer;
    }
}