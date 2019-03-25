package programmers.q12953;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{2, 6, 8, 14}));
    }
}

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }

    // 최소공배수
    private int lcm(int a, int b) {
        int big = a;
        int small = b;
        int r = 1;

        int temp1 = big;
        int temp2 = small;
        if (small > big) {
            big = temp2;
            small = temp1;
        }

        while (r > 0) {
            r = big % small;
            big = small;
            small = r;
        }
        return temp1 * temp2 / big;
    }
}
