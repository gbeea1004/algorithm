package programmers.q42748;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
//        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[][] commands = {{4, 4, 1}, {1, 7, 1}, {1, 7, 2}, {7, 7, 1}};
        Solution solution = new Solution();
        int[] result = solution.solution(array, commands);
        for (int i : result) {
            System.out.println(i);
        }
    }
}

// TODO : 왜 안될까??
//class Solution {
//    public int[] solution(int[] array, int[][] commands) {
//        StringBuilder input = new StringBuilder();
//        for (int i : array) {
//            input.append(i);
//        }
//
//        int[] answer = new int[commands.length];
//        for (int i = 0; i < commands.length; i++) {
//            char[] text = input.substring(commands[i][0] - 1, commands[i][1]).toCharArray();
//            Arrays.sort(text);
//            answer[i] = text[commands[i][2] - 1] - '0';
//        }
//        return answer;
//    }
//}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] text = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(text);
            answer[i] = text[commands[i][2] - 1];
        }
        return answer;
    }
}
