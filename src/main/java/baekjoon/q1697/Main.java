package baekjoon.q1697;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] position = new int[2];
        position[0] = scanner.nextInt();
        position[1] = scanner.nextInt();
        System.out.println(new Solution().solution(position));
    }
}

class Solution {
    public int solution(int[] position) {
        Queue<Integer> pos = new LinkedList<>();
        int[] visit = new int[100005];
        int[] dx = new int[3];

        pos.add(position[0]);
        visit[position[0]] = 1;

        while (!pos.isEmpty() && !pos.contains(position[1])) {
            int currentPos = pos.poll();

            dx[0] = currentPos + 1;
            dx[1] = currentPos + -1;
            dx[2] = currentPos * 2;

            for (int i = 0; i < 3; i++) {
                int nextPos = dx[i];
                if (nextPos < 0 || nextPos > 100000) {
                    continue;
                }

                // 방문하지 않았으면 추가
                if (visit[nextPos] == 0) {
                    pos.add(nextPos);
                    visit[nextPos] = visit[currentPos] + 1;
                }
            }
        }
        return visit[position[1]] - 1;
    }
}