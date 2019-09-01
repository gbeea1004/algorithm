package coding_test.y2019.programmers_jobmore_2019_02_23.q3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] healths = {300,200,500};
        int[][] items = {{1000, 600}, {400, 500}, {300, 100}};
        System.out.println(Arrays.toString(solution.solution(healths, items)));
    }
}

class Solution {
    public int[] solution(int[] healths, int[][] items) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < items.length; i++) {
            map.put(items[i][0], i + 1);
        }

        Arrays.sort(items, (o1, o2) -> o2[0] - o1[0]);
        List<Integer> result = new ArrayList<>();
        Arrays.sort(healths);
        for (int health : healths) {
            for (int i = 0; i < items.length; i++) {
                if (health - items[i][1] >= 100) {
                    if (map.get(items[i][0]) != null) {
                        result.add(map.get(items[i][0]));
                        map.remove(items[i][0]);
                        break;
                    }
                }
            }
        }
        int[] answer = new int[result.size()];
        int i = 0;
        for (Integer integer : result) {
            answer[i++] = integer;
        }
        Arrays.sort(answer);
        return answer;
    }
}
