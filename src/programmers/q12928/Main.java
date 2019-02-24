package programmers.q12928;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        System.out.println(solution.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer + n;
    }
}