package programmers.q12930;

// 다시풀기
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "try hello world";
        System.out.println(solution.solution(s));
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }
}
