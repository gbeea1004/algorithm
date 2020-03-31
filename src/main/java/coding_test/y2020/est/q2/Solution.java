package coding_test.y2020.est.q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int solution(int[] A) {
        List<Integer> values = createValues(A);
        Collections.sort(values);

        int maxValue = 0;
        boolean isSameValue = false;
        for (int i = values.size() - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                int numberA = values.get(i);
                int numberB = values.get(j);

                if (isSameSumOfDigits(numberA, numberB)) {
                    int sum = values.get(i) + values.get(j);
                    if (maxValue < sum) {
                        maxValue = sum;
                    }
                    isSameValue = true;
                }
            }
        }
        if (isSameValue) {
            return maxValue;
        }
        return -1;
    }

    private boolean isSameSumOfDigits(int numberA, int numberB) {
        return calculateSumOfDigits(numberA) == calculateSumOfDigits(numberB);
    }

    private int calculateSumOfDigits(int number) {
        String numberToStr = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < numberToStr.length(); i++) {
            sum += numberToStr.charAt(i) - '0';
        }
        return sum;
    }

    private List<Integer> createValues(int[] A) {
        List<Integer> values = new ArrayList<>();
        for (int value : A) {
            values.add(value);
        }
        return values;
    }
}
