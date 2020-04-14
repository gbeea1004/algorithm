package baekjoon.q1049;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] stores = new int[m][2];
        for (int i = 0; i < m; i++) {
            stores[i][0] = scanner.nextInt();
            stores[i][1] = scanner.nextInt();
        }
        System.out.print(new Solution().solution(n, stores));
        scanner.close();
    }
}

class Solution {
    public int solution(int n, int[][] stores) {
        int[] sixPackPrices = new int[stores.length];
        int[] singlePrices = new int[stores.length];

        for (int i = 0; i < stores.length; i++) {
            sixPackPrices[i] = stores[i][0];
            singlePrices[i] = stores[i][1];
        }

        Arrays.sort(sixPackPrices);
        Arrays.sort(singlePrices);

        int minSixPackPrice = sixPackPrices[0];
        int minSinglePrice = singlePrices[0];

        // 패키지로 구매했을 경우
        int onlyPackageToBuy = n / 6;
        if (n % 6 > 0) {
            onlyPackageToBuy++;
        }
        onlyPackageToBuy *= minSixPackPrice;

        // 단일 상품으로 구매했을 경우
        int onlySingleToBuy = minSinglePrice * n;

        // 혼합으로 구매했을 경우
        int mixPrice;
        int na = 0;
        if ((na = n % 6) > 0) {
            mixPrice = (minSixPackPrice * (n / 6)) + (minSinglePrice * na);
        } else {
            mixPrice = n / 6 * minSixPackPrice; // 혼합이 아니면 그냥 패키지로 구매
        }
        return Math.min(onlyPackageToBuy, Math.min(onlySingleToBuy, mixPrice));
    }
}