package programmers.q12943;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long num = 626331;
        System.out.println(solution.solution(num));
    }
}

class Solution {
    public int solution(long num) {
        int answer = 0;
        while (true) {
            if (answer >= 500) {
                answer = -1;
                break;
            }
            if (num == 1) {
                break;
            }

            if (num % 2 == 0) {
                num /= 2;
                answer++;
            } else if (num % 2 == 1) {
                num = num * 3 + 1;
                answer++;
            }
        }
        return answer;
    }
}