package programmers.q12932;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long n = 12345;
        int[] result = solution.solution(n);
        for (int i : result) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] solution(long n) {
        String a = String.valueOf(n);
        System.out.println(a);
        int[] answer = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            answer[i] = Integer.parseInt(a.charAt(a.length() - 1 - i) + "");
        }
        return answer;
    }
}