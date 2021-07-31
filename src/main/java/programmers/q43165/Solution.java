package programmers.q43165;

public class Solution {
    private int answer;
    private int[] numbers;
    private int target;

    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;

        dfs(numbers[0], 1);
        dfs(-numbers[0], 1);

        return answer;
    }

    public void dfs(int value, int index) {
        if (numbers.length == index) {
            if (target == value) {
                answer++;
            }
            return;
        }

        int numberA = value + numbers[index];
        int numberB = value - numbers[index];

        dfs(numberA, index + 1);
        dfs(numberB, index + 1);
    }
}
