package programmers.q42885;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{10, 30, 40, 20, 100}, 100));
//        System.out.println(solution.solution(new int[]{40, 50, 90, 95}, 100));
    }
}

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        List<Integer> weightOfPeople = new LinkedList<>();
        for (int person : people) {
            weightOfPeople.add(person);
        }

        while (!weightOfPeople.isEmpty()) {
            int checkWeightOne = weightOfPeople.get(0);
            if (weightOfPeople.size() == 1) {
                answer++;
                break;
            }
            if (checkWeightOne + weightOfPeople.get(1) > limit) {
                weightOfPeople.remove(0);
                answer++;
                continue;
            }

            for (int i = weightOfPeople.size() - 1; i > 0; i--) {
                int checkWeightTwo = weightOfPeople.get(i);
                if (checkWeightOne + checkWeightTwo <= limit) {
                    weightOfPeople.remove(i);
                    weightOfPeople.remove(0);
                    answer++;
                    break;
                } else {
                    weightOfPeople.remove(i);
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}