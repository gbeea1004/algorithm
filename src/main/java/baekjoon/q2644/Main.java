package baekjoon.q2644;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int personA = scanner.nextInt();
        int personB = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] relations = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            relations[x][y] = 1;
            relations[y][x] = 1;
        }
        System.out.print(new Solution().solution(personA, personB, relations));
    }
}

class Solution {
    private int[][] relations;
    private boolean[][] visit;
    private int findNo;
    private int result = -1;

    public int solution(int personA, int personB, int[][] relations) {
        this.relations = relations;
        findNo = personB;
        visit = new boolean[relations.length][relations[0].length];

        for (int i = 0; i < relations[0].length; i++) {
            if (relations[personA][i] == 1) {
                visit[personA][i] = true;
                visit[i][personA] = true;
                int count = 0;
                dfs(i, count);
            }
        }
        return result;
    }

    private void dfs(int start, int count) {
        count++;

        if (start == findNo) {
            result = count;
            return;
        }

        for (int i = 0; i < relations[0].length; i++) {
            if (relations[start][i] == 1 && !visit[start][i]) {
                visit[start][i] = true;
                visit[i][start] = true;
                dfs(i, count);
            }
        }
    }
}
