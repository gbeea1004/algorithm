package baekjoon.q2437;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> weights = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            weights.add(scanner.nextInt());
        }
        System.out.print(Solution.solution(weights));
    }
}

class Solution {
    public static int solution(List<Integer> weights) {
        Collections.sort(weights);
        int target = 1;
        for (Integer weight : weights) {
            if (target < weight) {
                break;
            }
            target += weight;
        }
        return target;
    }
}
