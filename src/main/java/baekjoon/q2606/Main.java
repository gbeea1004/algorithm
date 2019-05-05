package baekjoon.q2606;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int computerCount = Integer.parseInt(br.readLine());
        int connectCount = Integer.parseInt(br.readLine());

        int[][] connectComputer = new int[computerCount + 1][computerCount + 1];
        for (int i = 0; i < connectCount; i++) {
            int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            connectComputer[input[0]][input[1]] = 1;
            connectComputer[input[1]][input[0]] = 1;
        }


        Solution solution = new Solution();
        bw.write(String.valueOf(solution.solution(connectComputer, computerCount)));
        bw.flush();
    }
}

class Solution {
    private int count = 0;

    public int solution(int[][] connectComputer, int computerCount) {
        boolean[] visit = new boolean[computerCount + 1];
        dfs(1, connectComputer, visit);
        return count;
    }

    private void dfs(int start, int[][] connectComputer, boolean[] visit) {
        visit[start] = true;
        for (int i = 1; i < connectComputer.length; i++) {
            if (connectComputer[start][i] == 1 && !visit[i]) {
                dfs(i, connectComputer, visit);
                count++;
            }
        }
    }
}
