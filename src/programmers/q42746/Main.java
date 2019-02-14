package programmers.q42746;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{3, 30, 34, 5, 9}));
    }
}

class Solution {
    public String solution(int[] numbers) {
        String[] num = new String[numbers.length];

        int index = 0;
        for (int s : numbers) {
            num[index++] = String.valueOf(s);
        }
        // o1 = "6" , o2 = "10" 일때,
        // ("10" + "6") = "106" , ("6" + "10") = "610"
        // "106" < "610"
        // return 1;

        // 참고
        // return -1 일 때, (o2 + o1) (죄축)이 먼저 나옴
        // return 0 일때, 변함없음.
        // return 1 일때, (o2 + o1) (우측)가 먼저 나옴
        Arrays.sort(num, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        StringBuilder sb = new StringBuilder();
        // num[0] 이 '0'이라는 것은 제일 큰 수가 '0'이므로, '0'을 반환한다.
        if (num[0].equals("0")) {
            sb.append("0");
        } else {
            for (String s : num) {
                sb.append(s);
            }
        }
        return sb.toString();
    }
}

class QuickSort {
    public static void sort(int[] data, int l, int r) {
        int left = l;
        int right = r;
        int pivot = data[(l + r) / 2]; // 기준 점

        do {
            while (data[left] > pivot) {
                left++;
            }
            while (data[right] < pivot) {
                right--;
            }
            if (left <= right) {
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        } while (left <= right);

        if (l < right) {
            sort(data, l, right);
        }
        if (r > left) {
            sort(data, left, r);
        }
    }
}