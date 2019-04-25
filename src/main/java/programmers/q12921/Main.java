package programmers.q12921;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 10;
        System.out.println(solution.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            boolean sosu = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    sosu = false;
                    break;
                }
            }
            if (sosu) {
                answer++;
            }
        }
        return answer;
    }
}