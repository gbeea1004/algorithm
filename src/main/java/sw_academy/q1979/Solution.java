package sw_academy.q1979;

import java.io.*;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 1; i <= count; i++) {
            int result = 0;
            int[] no = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[][] puzzle = new int[no[0]][no[0]];
            for (int j = 0; j < puzzle.length; j++) {
                int[] lineNo = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int k = 0; k < puzzle.length; k++) {
                    puzzle[j][k] = lineNo[k];
                }
            }

            // 가로체크
            for (int j = 0; j < puzzle.length; j++) {
                int moveDir = 0;
                for (int k = 0; k < puzzle.length; k++) {
                    if (puzzle[j][k] == 1) {
                        moveDir++;
                    }
                    if (k < puzzle.length - 1 && puzzle[j][k + 1] == 0) {
                        if (moveDir == no[1]) {
                            result++;
                        }
                        moveDir = 0;
                    }
                }
                if (moveDir == no[1]) {
                    result++;
                }
            }

            // 세로체크
            for (int j = 0; j < puzzle.length; j++) {
                int moveDir = 0;
                for (int k = 0; k < puzzle.length; k++) {
                    if (puzzle[k][j] == 1) {
                        moveDir++;
                    }
                    if (k < puzzle.length - 1 && puzzle[k + 1][j] == 0) {
                        if (moveDir == no[1]) {
                            result++;
                        }
                        moveDir = 0;
                    }
                }
                if (moveDir == no[1]) {
                    result++;
                }
            }
            bw.write("#" + i + " " + result);
            bw.newLine();
        }
        bw.flush();
    }
}
