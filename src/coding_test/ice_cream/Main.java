package coding_test.ice_cream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 2019.04.03.수
 * { 101, 2, 3, 4, 102, 3, 1, 2, 3, 101, 1, 5 }
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[]{101, 2, 3, 4, 102, 3, 1, 2, 3, 101, 1, 5});
    }
}

class Solution {
    public void solution(int[] no) {
        Map<Integer, Bunzi> result = new HashMap<>();
        int bunziIndex = 0;
        int bunzi = 0;
        int checkCountIndex = 0;
        for (int i = 0; i < no.length; i++) {
            if (bunziIndex == i) {
                if (result.get(no[i]) == null) {
                    result.put(no[i], new Bunzi());
                }
                bunzi = no[i];
                checkCountIndex += no[++i] + 2;
                bunziIndex = checkCountIndex;
                continue;
            } else if (checkCountIndex > i) {
                result.get(bunzi).addNo(no[i]);
            }
        }

        for (Integer bunziNo : result.keySet()) {
            Bunzi currentBunzi = result.get(bunziNo);
            System.out.println("번지 : " + bunziNo + ", 총합 : " + currentBunzi.showSum() + ", 평균 : " + currentBunzi.showAvg());
        }
    }
}

class Bunzi {
    private List<Integer> numbers = new ArrayList<>();

    public void addNo(int no) {
        numbers.add(no);
    }

    public int showSum() {
        int result = 0;
        for (Integer number : numbers) {
            result += number;
        }
        return result;
    }

    public int showAvg() {
        return showSum() / numbers.size();
    }
}