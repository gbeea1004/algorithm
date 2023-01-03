package programmers.q142086;

public class Solution {

    public int[] solution(String s) {
        String[] texts = s.split("");
        int[] answer = new int[s.length()];
        answer[0] = -1;

        for (int i = 1; i < texts.length; i++) {
            String text = texts[i];
            int dir = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (text.equals(texts[j])) {
                    break;
                }

                if (j == 0) {
                    dir = -1;
                    break;
                }

                dir++;
            }

            answer[i] = dir;
        }

        return answer;
    }
}
