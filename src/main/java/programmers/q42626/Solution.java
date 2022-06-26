package programmers.q42626;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Solution {

    public int solution(int[] scoville, int K) {
        List<Integer> scovilles = Arrays.stream(scoville)
                                        .boxed()
                                        .collect(Collectors.toList());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(scovilles);
        int answer = 0;

        while (true) {
            if (isAllFoodScovilleMoreThan(K, priorityQueue)) {
                break;
            }

            if (isNotValid(priorityQueue)) {
                return -1;
            }

            priorityQueue.add(priorityQueue.poll() + priorityQueue.poll() * 2);
            answer++;
        }

        return answer;
    }

    private boolean isNotValid(PriorityQueue<Integer> priorityQueue) {
        return priorityQueue.size() == 1;
    }

    private boolean isAllFoodScovilleMoreThan(int K, PriorityQueue<Integer> priorityQueue) {
        return priorityQueue.peek() >= K;
    }
}
