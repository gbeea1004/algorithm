package coding_test.kakao.intern.q3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int K = 3;
        int[] coffee_times = {4, 2, 2, 5, 3};
        Solution solution = new Solution();
        int[] result = solution.solution(K, coffee_times);
        for (int i : result) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] solution(int K, int[] coffee_times) {
        List<Integer> complete = new ArrayList<>();
        Map<Integer, Integer> makeCoffee = new HashMap<>();

        int time = -1;
        int coffeeNo = 0;

        while (complete.size() != coffee_times.length) {
            time++;
            while (makeCoffee.size() <= K) {
                coffeeNo++;
                System.out.println(coffeeNo);
                makeCoffee.put(coffeeNo, coffee_times[coffeeNo - 1]);
            }

            for (int i = 1; i <= makeCoffee.size(); i++) {
                if (makeCoffee.get(i) == time) {
                    makeCoffee.remove(i);
                    complete.add(i);
                }
            }
        }

        int[] answer = new int[complete.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = complete.get(i);
        }
        return answer;
    }
}
