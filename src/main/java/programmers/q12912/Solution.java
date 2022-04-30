package programmers.q12912;

public class Solution {

    public long solution(int a, int b) {
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        long answer = 0;
        for (int no = start; no <= end; no++) {
            answer += no;
        }
        return answer;
    }
}
