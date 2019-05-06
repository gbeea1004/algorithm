package baekjoon.q2589;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arraySize = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[][] island = new String[arraySize[0]][arraySize[1]];
        for (int i = 0; i < island.length; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < island[1].length; j++) {
                island[i][j] = input[j];
            }
        }

        Solution solution = new Solution();
        bw.write(String.valueOf(solution.solution(island)));
        bw.flush();
    }
}

class Solution {
    // 상하좌우
    private final int[] H = {-1, 1, 0, 0};
    private final int[] V = {0, 0, -1, 1};

    // 최대경로
    private int maxDist = 0;

    public int solution(String[][] island) {
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                if (island[i][j].equals("L")) {
                    Queue<Point> q = new LinkedList<>();
                    boolean[][] visit = new boolean[island.length][island[0].length];
                    int[][] dist = new int[island.length][island[0].length];

                    q.add(new Point(i, j));
                    visit[i][j] = true;
                    int max = 0;

                    while (!q.isEmpty()) {
                        Point point = q.poll();
                        for (int k = 0; k < 4; k++) {
                            int checkX = H[k] + point.getX();
                            int checkY = V[k] + point.getY();

                            // 범위 벗어남
                            if (checkX < 0 || checkY < 0 || checkX >= island.length || checkY >= island[0].length) {
                                continue;
                            }

                            // 방문했는가
                            if (island[checkX][checkY].equals("L") && !visit[checkX][checkY]) {
                                q.add(new Point(checkX, checkY));
                                dist[checkX][checkY] = dist[point.getX()][point.getY()] + 1;
                                visit[checkX][checkY] = true;

                                if (max < dist[checkX][checkY]) {
                                    max = dist[checkX][checkY];
                                }
                            }
                        }
                    }
                    if (maxDist < max) {
                        maxDist = max;
                    }
                }
            }
        }
        return maxDist;
    }
}

class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}
