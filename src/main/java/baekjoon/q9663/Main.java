package baekjoon.q9663;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(new Solution().solution(scanner.nextInt()));
    }
}

class Solution {
    private int[] path;
    private int result;

    public int solution(int n) {
        result = 0;
        path = new int[n];
        for (int i = 0; i < n; i++) {
            path[0] = i;
            dfs(0);
        }
        return result;
    }

    private void dfs(int row) {
        if (row == path.length - 1) {
            result++;
            return;
        }

        for (int i = 0; i < path.length; i++) {
            int next = row + 1;
            path[next] = i;
            if (isSetQueenPosition(next)) {
                dfs(next);
            }
        }
    }

    private boolean isSetQueenPosition(int row) {
        for (int i = 0; i < row; i++) {
            if (path[i] == path[row]) {
                return false;
            }
            // x 좌표의 차이와 y 좌표의 차이가 같으면 대각선이다.
            if (Math.abs(i - row) == Math.abs(path[i] - path[row])) {
                return false;
            }
        }
        return true;
    }
}
