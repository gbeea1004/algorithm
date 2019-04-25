package programmers.q12945;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        System.out.println(solution.solution(n));
    }
}

// 시간 초과
//class Solution {
//    public int solution(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        return (solution(n - 1) + solution(n - 2)) % 1234567;
//    }
//}

class Solution {
    public int solution(int n) {
        int f0 = 0;
        int f1 = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                sum = f0 + f1;
                f0 = f1 % 1234567;
                f1 = sum % 1234567;
            }
        }
        return sum % 1234567;
    }
}