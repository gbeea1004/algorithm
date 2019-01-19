package programmers.q12910;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;
        int[] result = solution.solution(arr, divisor);
        for (int i : result) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if (list.size() == 0) {
            list.add(-1);
        } else {
            list.sort(Comparator.comparingInt(o -> o));
        }
        return list.stream().mapToInt(e -> e).toArray();
    }
}

// 다른 사람의 풀이
//class Solution {
//    public int[] solution(int[] arr, int divisor) {
//        return Arrays.stream(arr).filter(e -> e % divisor == 0).sorted().toArray();
//    }
//}
