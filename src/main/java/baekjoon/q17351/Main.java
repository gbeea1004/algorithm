package baekjoon.q17351;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[][] words = new String[size][size];
        for (int i = 0; i < size; i++) {
            words[i] = br.readLine().split("");
        }
        System.out.println(new Solution().solution(words));
    }
}

class Solution {
    private String[][] words;
    private int[] ROW_DIR = {0, 1};
    private int[] COLUMN_DIR = {1, 0};
    private String[] MOLA = {"M", "O", "L", "A"};

    public int solution(String[][] words) {
        this.words = words;
        int max = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i][j].equals("M")) {
                    max = Math.max(max, run(new Point(i, j)));
                }
            }
        }
        return max;
    }

    private int run(Point startPoint) {
        Queue<Point> startPoints = new LinkedList<>();
        int[][] visit = new int[words.length][words.length];
        startPoints.add(startPoint);
        visit[startPoint.x][startPoint.y] = 1;


        while (!startPoints.isEmpty()) {
            Point point = startPoints.poll();

            for (int i = 0; i < 2; i++) {
                int nextRow = point.x + ROW_DIR[i];
                int nextColumn = point.y + COLUMN_DIR[i];

                // 범위 체크
                if (nextRow < 0 || nextColumn < 0 || nextRow >= words.length || nextColumn >= words.length) {
                    continue;
                }

                // 알파벳 체크
                String nextAlpha = MOLA[("MOLA".indexOf(words[point.x][point.y]) + 1) % 4]; // 다음 알파벳
                if ("MOLA".contains(words[nextRow][nextColumn])) {
                    if (words[nextRow][nextColumn].equals(nextAlpha)) {
                        startPoints.add(new Point(nextRow, nextColumn));
                        visit[nextRow][nextColumn] = visit[point.x][point.y] + 1;
                    }
                } else {
                    startPoints.add(new Point(nextRow, nextColumn));
                    visit[nextRow][nextColumn] = visit[point.x][point.y];
                }
            }
        }

        for (int[] ints : visit) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println();

        int max = 0;
        for (int i = 0; i < visit.length; i++) {
            for (int j = 0; j < visit.length; j++) {
                if (max < visit[i][j]) {
                    max = visit[i][j];
                }
            }
        }
        return max / 4;
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