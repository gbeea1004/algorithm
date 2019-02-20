package programmers.q12934;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3));
    }
}

class Solution {
    public long solution(long n) {
        long answer = 0;
        double checker = Math.sqrt(n);
        if (checker - (long)checker == 0.0) {
            answer = (long)checker + 1;
            answer *= answer;
        } else {
            answer = -1;
        }
        return answer;
    }
}