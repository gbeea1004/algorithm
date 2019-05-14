package baekjoon.q1780;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[][] paper = new int[count][count];
        for (int i = 0; i < count; i++) {
            int[] no = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < count; j++) {
                paper[i][j] = no[j];
            }
        }
        Solution solution = new Solution();
        Map<Integer, Integer> resutlt = solution.solution(paper);
        for (int countOfPaper : resutlt.values()) {
            bw.write(String.valueOf(countOfPaper));
            bw.newLine();
        }
        bw.flush();
    }
}

class Solution {
    private Map<Integer, Integer> result = new HashMap<>();

    Solution() {
        result.put(-1, 0);
        result.put(0, 0);
        result.put(1, 0);
    }

    public Map<Integer, Integer> solution(int[][] paper) {
        checkMatrix(0, 0, paper[0].length, paper);
        return result;
    }

    private void checkMatrix(int startRow, int startColumn, int len, int[][] paper) {
        if (isSame(startRow, startColumn, len, paper)) {
            result.put(paper[startRow][startColumn], result.get(paper[startRow][startColumn]) + 1);
        } else {
            int newLen = len / 3;
            // 3등분으로 쪼개기
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    checkMatrix(startRow + newLen * i, startColumn + newLen * j, newLen, paper);
                }
            }
        }
    }

    private boolean isSame(int startRow, int startColumn, int len, int[][] paper) {
        int sameNo = paper[startRow][startColumn];
        for (int i = startRow; i < startRow + len; i++) {
            for (int j = startColumn; j < startColumn + len; j++) {
                if (sameNo != paper[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
