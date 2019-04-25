package programmers.q12906;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,1,3,3,0,1,1};
        int[] result = solution.solution(arr);

        for (Integer i : result) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] solution(int []arr) {
        int currentNo = -1;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int no = arr[i];
            if (no != currentNo) {
                list.add(no);
                currentNo = no;
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}