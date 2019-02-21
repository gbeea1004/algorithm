package programmers.q12899;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(6));
    }
}

class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int na;
        while (n > 0) {
            na = n % 3;
            n /= 3;
            if (na == 0) {
                n--;
                na = 4;
            }
            sb.insert(0, na);
        }
        return sb.toString();
    }
}