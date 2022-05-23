package programmers.q12922;

public class Solution {

    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            answer.append(print(i));
        }

        return answer.toString();
    }

    private String print(int index) {
        return index % 2 == 0 ? "박" : "수";
    }
}
