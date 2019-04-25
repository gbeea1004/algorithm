package programmers.q12934;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3));
    }
}

// 다른 사람이 푼 방법
class Solution {
    public long solution(long n) {
        if (Math.pow((int)Math.sqrt(n), 2) == n) { // Math.pow => 제곱
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
    }
}

// 내가 푼 방법
//class Solution {
//    public long solution(long n) {
//        long answer = 0;
//        double checker = Math.sqrt(n);
//        if (checker - (long)checker == 0.0) {
//            answer = (long)checker + 1;
//            answer *= answer;
//        } else {
//            answer = -1;
//        }
//        return answer;
//    }
//}