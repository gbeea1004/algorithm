package baekjoon.q1303;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());
        String[][] battleground = new String[M][N];
        for (int i = 0; i < battleground.length; i++) {
            battleground[i] = br.readLine().split("");
        }

        bw.write(new Solution().solution(battleground));
        bw.newLine();

        bw.flush();

        bw.close();
        br.close();
    }
}

class Solution {

    private static final int[] X_DIR = {-1, 1, 0, 0};
    private static final int[] Y_DIR = {0, 0, -1, 1};
    private static final String WHITE_SOLDIER = "W";
    private static final String BLUE_SOLDIER = "B";
    private boolean[][] visit;
    private int totalWCount;
    private int totalBCount;

    public String solution(String[][] battleground) {
        visit = new boolean[battleground.length][battleground[0].length];
        totalWCount = 0;
        totalBCount = 0;

        for (int i = 0; i < battleground.length; i++) {
            for (int j = 0; j < battleground[0].length; j++) {
                if (!visit[i][j]) {
                    bfs(i, j, battleground);
                }
            }
        }

        return totalWCount + " " + totalBCount;
    }

    private void bfs(int x, int y, String[][] battleground) {
        Queue<Point> points = new LinkedList<>();
        points.add(new Point(x, y));
        visit[x][y] = true;
        int count = 1;
        String startColor = "";

        if (battleground[x][y].equals(WHITE_SOLDIER)) {
            startColor = WHITE_SOLDIER;
        }

        if (battleground[x][y].equals(BLUE_SOLDIER)) {
            startColor = BLUE_SOLDIER;
        }

        while (!points.isEmpty()) {
            Point point = points.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = point.x + X_DIR[i];
                int nextY = point.y + Y_DIR[i];

                if (nextX < 0 || nextY < 0 || nextX >= battleground.length || nextY >= battleground[0].length) {
                    continue;
                }

                if (visit[nextX][nextY]) {
                    continue;
                }

                String soldier = battleground[nextX][nextY];

                if (soldier.equals(startColor)) {
                    count++;
                    points.add(new Point(nextX, nextY));
                    visit[nextX][nextY] = true;
                }
            }
        }

        if (startColor.equals(WHITE_SOLDIER)) {
            totalWCount += (count * count);
        }

        if (startColor.equals(BLUE_SOLDIER)) {
            totalBCount += (count * count);
        }
    }

    class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
