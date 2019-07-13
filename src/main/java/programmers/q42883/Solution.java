package programmers.q42883;

public class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for (int i = 0; i < number.length() - k; i++) {
            char max = '0';
            for (int j = start; j < number.length() - k + i; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    start = j + 1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}
