package programmers.q12947;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 13;
        System.out.println(solution.solution(x));
    }
}

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] value = String.valueOf(x).split("");
        int sum = 0;
        for (String s : value) {
            sum += Integer.parseInt(s);
        }
        if (x % sum != 0) {
            answer = false;
        }
        return answer;
    }
}