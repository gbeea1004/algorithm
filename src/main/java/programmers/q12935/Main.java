package programmers.q12935;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2,1,1,1};
        int[] result = solution.solution(arr);
        for (int i : result) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = arr[0];
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (min != arr[i]) {
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        int size = 0;
        for (Integer integer : list) {
            answer[size++] = integer;
        }

        return answer;
    }
}
