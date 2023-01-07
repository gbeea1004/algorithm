package programmers.q134240;

public class Solution {
    public String solution(int[] food) {
        int[] results = new int[getResultLength(food)];
        int startIndex = 0;
        int lastIndex = results.length - 1;

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            if (count >= 1) {
                for (int j = 0; j < count; j++) {
                    results[startIndex++] = i;
                    results[lastIndex--] = i;
                }
            }
        }

        return toString(results);
    }

    private int getResultLength(int[] food) {
        int length = 0;
        for (int i = 1; i < food.length; i++) {
            length += food[i] / 2;
        }
        return length * 2 + 1;
    }

    private String toString(int[] results) {
        String result = "";
        for (int foodCount : results) {
            result += foodCount;
        }
        return result;
    }
}
