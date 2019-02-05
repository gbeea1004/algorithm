package programmers.q12931;

public class Main {
    public static void main(String[] args) {
        int n = 987;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] input = String.valueOf(n).split("");
        for (String s : input) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}