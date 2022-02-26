package baekjoon.q16956;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        final int R = Integer.parseInt(st.nextToken());
        final int C = Integer.parseInt(st.nextToken());

        String[][] pasture = new String[R][C];
        for (int i = 0; i < pasture.length; i++) {
            pasture[i] = br.readLine().split("");
        }

        String[][] results = new Solution().solution(pasture);
        if (results == null) {
            bw.write("0");
        } else {
            bw.write("1");
            bw.newLine();
            for (String[] result : results) {
                for (String spot : result) {
                    bw.write(spot);
                }
                bw.newLine();
            }
        }
        bw.newLine();

        bw.flush();

        bw.close();
        br.close();
    }
}

class Solution {

    private static final String SHEEP = "S";
    private static final String WOLF = "W";
    private static final String FENCE = "D";
    private static final int[] X_DIR = {-1, 1, 0, 0};
    private static final int[] Y_DIR = {0, 0, -1, 1};

    public String[][] solution(String[][] pasture) {
        try {
            for (int i = 0; i < pasture.length; i++) {
                for (int j = 0; j < pasture[0].length; j++) {
                    if (pasture[i][j].equals(WOLF)) {
                        bfs(i, j, pasture);
                    }
                }
            }
            return pasture;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    private void bfs(int i, int j, String[][] pasture) {
        for (int k = 0; k < 4; k++) {
            int nextX = X_DIR[k] + i;
            int nextY = Y_DIR[k] + j;

            if (nextX < 0 || nextY < 0 || nextX >= pasture.length || nextY >= pasture[0].length) {
                continue;
            }

            String spot = pasture[nextX][nextY];
            if (spot.equals(SHEEP)) {
                throw new IllegalArgumentException("늑대가 양을 잡아먹었습니다.");
            }
            if (spot.equals(WOLF)) {
                continue;
            }
            if (spot.equals(FENCE)) {
                continue;
            }

            pasture[nextX][nextY] = FENCE;
        }
    }
}
