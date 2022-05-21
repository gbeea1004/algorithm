package programmers.q17681;

public class Solution {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < arr1.length; i++) {
            StringBuilder result = new StringBuilder();
            String line = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr1[i] | arr2[i])));
            for (String no : line.split("")) {
                result.append(no.equals("1") ? "#" : " ");
            }
            answer[i] = result.toString();
        }
        return answer;
    }
}
