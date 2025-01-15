package programmers.q181900;

public class Solution {

    public String solution(String my_string, int[] indices) {
        boolean[] isRemoved = new boolean[my_string.length()];
        for (int i = 0; i < indices.length; i++) {
            isRemoved[indices[i]] = true;
        }

        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (isRemoved[i]) {
                continue;
            }
            answer += my_string.charAt(i);
        }

        return answer;
    }
}
