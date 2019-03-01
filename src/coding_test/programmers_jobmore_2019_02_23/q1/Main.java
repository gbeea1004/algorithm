package coding_test.programmers_jobmore_2019_02_23.q1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(9));
    }
}

class Solution {
    private List<Integer> sosus = new ArrayList<>();

    public int solution(int n) {
        int answer = 0;
        makeSosu(n);
        System.out.println(sosus);
        int a;
        int b;
        int c;
        for (int i = 0; i < sosus.size(); i++) {
            a = sosus.get(i);
            for (int j = i + 1; j < sosus.size(); j++) {
                b = sosus.get(j);
                for (int k = j + 1; k < sosus.size(); k++) {
                    c = sosus.get(k);
                    if (a + b + c == n) {
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    private void makeSosu(int n) {
        for (int i = 2; i <= n; i++) {
            boolean sosu = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    sosu = false;
                    break;
                }
            }
            if (sosu) {
                sosus.add(i);
            }
        }
    }
}