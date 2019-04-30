package programmers.q42578;

import java.util.HashMap;
import java.util.Map;

/*
    푼날짜 : 2019-03-21
    회고 : 처음에는 '조합'을 이용하려고 했으나 굳이 그럴필요가 없다는 것을 알게됨
*/

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        String[][] clothes = {{"crow_mask", "base"}, {"blue_sunglasses", "b"}, {"s", "face"}};
        System.out.println(solution.solution(clothes));
    }
}

class Solution {
    private Map<String, Integer> map = new HashMap<>();

    public int solution(String[][] clothes) {
        for (int i = 0; i < clothes.length; i++) {
            if (map.get(clothes[i][1]) == null) {
                map.put(clothes[i][1], 1);
                continue;
            }
            map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
        }

        int answer = 1;
        for (Integer value : map.values()) {
            answer *= (value + 1); // 종류 마다 null 일 경우 추가
        }
        return answer - 1; // 제약 사항 : 최소 하나는 입어야 한다.
                           // 모두 null 일 경우는 제외시키기 위해 '- 1'
    }
}
