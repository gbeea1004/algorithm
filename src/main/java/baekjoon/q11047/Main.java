package baekjoon.q11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] coins = new int[input[0]];
        for (int i = 0; i < input[0]; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        System.out.print(new Solution().solution(input[1], coins));
    }
}

class Solution {
    public int solution(int money, int[] coins) {
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            int mok = (money / coins[i]);
            if (mok > 0) {
                count += mok;
                money -= (coins[i] * mok);
            }
        }
        return count;
    }
}
