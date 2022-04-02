package baekjoon.q1547;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int ballPos = 1;
        Solution solution = new Solution();
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (x == ballPos || y == ballPos) {
                ballPos = solution.solution(x, y, ballPos);
            }
        }

        System.out.println(ballPos);

        br.close();
    }
}

class Solution {

    public int solution(int x, int y, int ballPos) {
        return ballPos == x ? y : x;
    }
}
