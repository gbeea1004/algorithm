package programmers.q68935;

public class Solution {

    public int solution(int n) {
        String ternary = Integer.toString(n, 3);
        return Integer.parseInt(reverseNo(ternary), 3);
    }

    public String reverseNo(String no) {
        String[] numbers = no.split("");
        StringBuilder result = new StringBuilder();
        for (int i = numbers.length - 1; i >= 0; i--) {
            result.append(numbers[i]);
        }
        return result.toString();
    }
}
