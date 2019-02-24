package programmers.q12917;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Zbcdefg";
        System.out.println(solution.solution(s));
    }
}

class Solution {
    public String solution(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return String.valueOf(arr);
    }
}