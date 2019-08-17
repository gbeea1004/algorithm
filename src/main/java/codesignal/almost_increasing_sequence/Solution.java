package codesignal.almost_increasing_sequence;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    boolean check(int idx, List<Integer> numbers) {
        List<Integer> b = new ArrayList<>();
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (i == idx) {
                b.add(numbers.get(i));
                continue;
            }
            if (i == idx + 1) {
                a.add(numbers.get(i));
                continue;
            }
            a.add(numbers.get(i));
            b.add(numbers.get(i));
        }

        boolean checkerA = true;
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) >= a.get(i + 1)) {
                checkerA = false;
                break;
            }
        }

        boolean checkerB = true;
        for (int i = 0; i < b.size() - 1; i++) {
            if (b.get(i) >= b.get(i + 1)) {
                checkerB = false;
                break;
            }
        }
        return checkerA || checkerB;
    }

    boolean almostIncreasingSequence(int[] sequence) {
        List<Integer> numbers = new ArrayList<>();
        for (int no : sequence) {
            numbers.add(no);
        }

        int idx = 0;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) >= numbers.get(i + 1)) {
                idx = i;
                return check(idx, numbers);
            }
        }
        return true;
    }
}
