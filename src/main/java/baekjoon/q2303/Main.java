package baekjoon.q2303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] cards = new int[n][5];

        for (int i = 0; i < n; i++) {
            cards[i] = Arrays.stream(br.readLine().split(" "))
                             .mapToInt(Integer::parseInt)
                             .toArray();
        }

        System.out.println(new Solution().solution(cards));

        br.close();
    }
}

class Solution {

    public int solution(int[][] cards) {
        List<Integer> maxNumberOfOneDigits = new ArrayList<>();
        int resultPersonNo = 1;

        for (int[] card : cards) {
            int maxNumberOfOneDigit = 0;

            for (int i = 0; i < card.length; i++) {
                for (int j = 0; j < card.length; j++) {
                    for (int k = 0; k < card.length; k++) {
                        if (i == j || j == k || k == i) {
                            continue;
                        }

                        String sum = String.valueOf(card[i] + card[j] + card[k]);
                        int oneDigitNo = sum.charAt(sum.length() - 1) - '0';
                        maxNumberOfOneDigit = Math.max(maxNumberOfOneDigit, oneDigitNo);
                    }
                }
            }

            maxNumberOfOneDigits.add(maxNumberOfOneDigit);
        }

        Integer maxNo = maxNumberOfOneDigits.get(0);
        for (int i = 1; i < maxNumberOfOneDigits.size(); i++) {
            Integer no = maxNumberOfOneDigits.get(i);

            if (no >= maxNo) {
                resultPersonNo = i + 1;
                maxNo = no;
            }
        }

        return resultPersonNo;
    }
}
