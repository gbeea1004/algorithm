package baekjoon.q5567;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        final int M = Integer.parseInt(br.readLine());
        int[][] relationships = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            relationships[a][b] = 1;
            relationships[b][a] = 1;
        }

        System.out.println(new Solution().solution(N, relationships));

        br.close();
    }
}

class Solution {

    private int result;
    private boolean[] visit;

    public int solution(int n, int[][] relationships) {
        result = 0;
        visit = new boolean[n + 1];

        bfs(n, relationships);

        return result;
    }

    private void bfs(int n, int[][] relationships) {
        Queue<Point> points = new LinkedList<>();
        points.add(new Point(1, 0));
        visit[1] = true;

        while (!points.isEmpty()) {
            Point point = points.poll();

            for (int i = 1; i <= n; i++) {
                if (relationships[point.friend][i] != 1) {
                    continue;
                }

                if (visit[i]) {
                    continue;
                }

                if (point.isFinish()) {
                    continue;
                }

                points.add(new Point(i, point.relationshipCount + 1));
                visit[i] = true;
                result++;
            }
        }
    }

    class Point {
        private int friend;
        private int relationshipCount;

        public Point(int friend, int relationshipCount) {
            this.friend = friend;
            this.relationshipCount = relationshipCount;
        }

        public boolean isFinish() {
            return relationshipCount >= 2;
        }
    }
}
