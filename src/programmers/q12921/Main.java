package programmers.q12921;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 10;
        System.out.println(solution.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        List<Boolean> prime = new ArrayList<>();

        prime.add(false); // 0
        prime.add(false); // 1

        for (int i = 2; i <= n; i++) {
            prime.add(i, true);
        }

        for (int i = 2; (i * i) <= n; i++) {
            if (prime.get(i)) {
                for (int j = i * i; j <= n; j += i) {
                    prime.set(j, false);
                }
            }
        }

        return (int)prime.stream().filter(e -> e.booleanValue()).count();
    }
}