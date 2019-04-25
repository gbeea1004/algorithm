package programmers.q43165;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1, 1, 1, 1, 1}, 3));
    }
}

class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(target, numbers, 0, 0);
    }

    private int dfs(int target, int[] numbers, int index, int num) {
        if (index == numbers.length) {
            return num == target ? 1 : 0;
        } else {
            return dfs(target, numbers, index + 1, num + numbers[index])
                    + dfs(target, numbers, index + 1, num - numbers[index]);
        }
    }
}
