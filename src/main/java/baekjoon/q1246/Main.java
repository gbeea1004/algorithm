package baekjoon.q1246;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());
        int[] customer = new int[M];
        for (int i = 0; i < M; i++) {
            customer[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(new Solution().solution(N, M, customer));

        br.close();
    }
}

class Solution {

    public String solution(int n, int m, int[] customer) {
        Arrays.sort(customer);

        int selectedPrice = 0;
        int maxRevenue = 0;

        for (int i = 0; i < m; i++) {
            int price = customer[i];
            int revenue = m - i < n ? price * (m - i) : price * n;

            if (revenue > maxRevenue) {
                maxRevenue = revenue;
                selectedPrice = price;
            }
        }

        return selectedPrice + " " + maxRevenue;
    }
}