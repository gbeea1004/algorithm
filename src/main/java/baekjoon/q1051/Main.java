package baekjoon.q1051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] numbers = new int[n][m];
        for (int i = 0; i < n; i++) {
            numbers[i] = Arrays.stream(br.readLine().split(""))
                               .mapToInt(Integer::parseInt)
                               .toArray();
        }

        System.out.println(new Solution().solution(n, m, numbers));

        br.close();
    }
}

class Solution {

    public int solution(int n, int m, int[][] numbers) {
        int checkNo = Math.min(n, m);
        while (checkNo >= 1) {
            int plusLength = checkNo - 1;
            for (int i = 0; i < numbers.length; i++) {
                if (i + plusLength >= numbers.length) {
                    break;
                }

                for (int j = 0; j < numbers[0].length; j++) {
                    if (j + plusLength >= numbers[0].length) {
                        break;
                    }

                    int leftTop = numbers[i][j];
                    int leftBottom = numbers[i + plusLength][j];
                    int rightTop = numbers[i][j + plusLength];
                    int rightBottom = numbers[i + plusLength][j + plusLength];

                    // 꼭지점이 모두 같은 경우
                    if (leftTop == leftBottom && rightTop == rightBottom && leftBottom == rightTop) {
                        return checkNo * checkNo;
                    }
                }
            }
            checkNo--;
        }

        return 1;
    }
}