package programmers.q77884;

public class Solution {

    public int solution(int left, int right) {
        int answer = 0;

        for (int no = left; no <= right; no++) {
            answer += divisorCount(no) % 2 == 0 ? no : -no;
        }

        return answer;
    }

    private int divisorCount(int no) {
        int count = 0;
        for (int i = 1; i <= no; i++) {
            if (no % i == 0) {
                count++;
            }
        }
        return count;
    }
}
