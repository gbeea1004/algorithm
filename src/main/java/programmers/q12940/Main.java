package programmers.q12940;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        int m = 12;
        int[] result = solution.solution(n, m);
        for (int i : result) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int tmp;
        int r = 1;
        int gup = n * m;
        if (n < m) {
            tmp = m;
            m = n;
            n = tmp;
        }

        while (r > 0) {
            r = n % m;
            n = m;
            m = r;
        }
        answer[0] = n; // 최대 공약수
        answer[1] = gup / n; // 최소 공배수
        return answer;
    }
}
