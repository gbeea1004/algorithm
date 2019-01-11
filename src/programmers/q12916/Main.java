package programmers.q12916;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Pyy";
        System.out.println(solution.solution(s));
    }
}

class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        return s.chars().filter(e -> e == 'p').count() == s.chars().filter(e -> e == 'y').count();
    }
}

// 1차
//class Solution {
//    boolean solution(String s) {
//        boolean answer = false;
//
//        int pCount = 0;
//        int yCount = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            char c =Character.toLowerCase(s.charAt(i));
//            if ('p' == c) {
//                pCount++;
//            } else if ('y' == c) {
//                yCount++;
//            }
//        }
//
//        if (pCount == yCount) {
//            return true;
//        }
//
//        if (pCount == 0 && yCount == 0) {
//            return true;
//        }
//
//        return answer;
//    }
//}


