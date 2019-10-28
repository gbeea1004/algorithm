package programmers.q60057;

public class Solution {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;

        for (int i = 1; i <= s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            String standard = s.substring(0, i);
            int cnt = 1;
            for (int j = i; j < s.length(); j += i) {
                String compare = s.substring(j, Math.min(j + i, s.length()));
                if (standard.equals(compare)) {
                    cnt++;
                } else {
                    appendSentence(cnt, standard, sb);
                    standard = compare;
                    cnt = 1;
                }
            }
            appendSentence(cnt, standard, sb);
            answer = Math.min(answer, sb.toString().length());
        }
        return answer;
    }

    private void appendSentence(int cnt, String standard, StringBuilder sb) {
        if (cnt > 1) {
            sb.append(cnt);
        }
        sb.append(standard);
    }
}
