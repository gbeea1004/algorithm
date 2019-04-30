package baekjoon.q2178;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] sizeOfMatrix = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] maze = new int[sizeOfMatrix[0]][sizeOfMatrix[1]];

        for (int i = 0; i < maze.length; i++) {
            int[] values = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < maze[0].length; j++) {
                maze[i][j] = values[j];
            }
        }

        Solution solution = new Solution();
        bw.write(String.valueOf(solution.solution(maze)));

        bw.flush();
    }
}

class Solution {
    // 상하좌우
    private final int[] ROW = {-1, 1, 0, 0};
    private final int[] COLUMN = {0, 0, -1, 1};

    public int solution(int[][] maze) {
        boolean[][] isCheck = new boolean[maze.length][maze[0].length];
        Queue<Dot> visitDots = new LinkedList<>();
        visitDots.add(new Dot(0, 0));
        isCheck[0][0] = true;

        while (!visitDots.isEmpty()) {
            Dot dot = visitDots.poll();
            // 동서남북 체크
            for (int k = 0; k < 4; k++) {
                int checkRow = dot.x + ROW[k];
                int checkColumn = dot.y + COLUMN[k];

                // 경계값 제외
                if (checkRow < 0 || checkRow > maze.length - 1 || checkColumn < 0 || checkColumn > maze[0].length - 1) {
                    continue;
                }

                // 방문했으면 제외
                if (isCheck[checkRow][checkColumn] || maze[checkRow][checkColumn] == 0) {
                    continue;
                }

                visitDots.add(new Dot(checkRow, checkColumn)); // 다음 방문지역 추가
                maze[checkRow][checkColumn] = maze[dot.x][dot.y] + 1; // 방문지역 비용 = 이전 걸음걸이 + 1
                isCheck[checkRow][checkColumn] = true;

            }
        }
        return maze[maze.length - 1][maze[0].length - 1];
    }
}

class Dot {
    int x;
    int y;

    Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}