package programmers.q17681;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String line = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]));
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == '1') {
                    sb.append("#");
                    continue;
                }
                sb.append(" ");
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}
