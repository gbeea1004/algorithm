package programmers.q12911;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(78));
    }
}

class Solution {
    public int solution(int n) {
        int count = Integer.bitCount(n);
        while (true) {
            ++n;
            if (Integer.bitCount(n) == count) {
                break;
            }
        }
        return n;
    }
}
