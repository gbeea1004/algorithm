package programmers.q43104;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(6));
    }
}

class Solution {
    public long solution(int N) {
        long[] fibonacci = new long[N];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci[N - 1] * 4 + fibonacci[N - 2] * 2;
    }
}