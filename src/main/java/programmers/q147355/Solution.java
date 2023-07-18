package programmers.q147355;

public class Solution {

    public int solution(String t, String p) {
        int answer = 0;
        int size = t.length() - p.length();
        long numberP = Long.parseLong(p);

        for (int i = 0; i <= size; i++) {
            long number = Long.parseLong(t.substring(i, i + p.length()));
            if (number <= numberP) {
                answer++;
            }
        }

        return answer;
    }
}
