package baekjoon.q12851;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        new Solution().solution(n, k);

        scanner.close();
    }
}

class Solution {

    private boolean[] visit;
    private int findSecond = 0;
    private int findCount = 0;

    public void solution(int n, int k) {
        visit = new boolean[100001];

        if (n > k) {
            System.out.println(n - k);
            System.out.println(1);
            return;
        }

        bfs(n, k);

        System.out.println(findSecond);
        System.out.println(findCount);
    }

    private void bfs(int n, int k) {
        Queue<Point> points = new LinkedList<>();
        points.add(new Point(n, 0));

        while (!points.isEmpty()) {
            Point point = points.poll();
            visit[point.position] = true;

            if (findSecond != 0 && findSecond < point.second) {
                continue;
            }

            if (point.position == k) {
                findSecond = point.second;
                findCount++;
                continue;
            }

            point.plusOneSecond();

            int go = point.position + 1;
            int back = point.position - 1;
            int teleport = point.position * 2;

            if (canGo(go) && !visit[go]) {
                points.add(new Point(go, point.second));
            }

            if (canGo(back) && !visit[back]) {
                points.add(new Point(back, point.second));
            }

            if (canGo(teleport) && !visit[teleport]) {
                points.add(new Point(teleport, point.second));
            }
        }

    }

    private boolean canGo(int position) {
        return 0 <= position && position <= 100000;
    }

    class Point {
        private int position;
        private int second;

        public Point(int position, int second) {
            this.position = position;
            this.second = second;
        }

        public void plusOneSecond() {
            second++;
        }
    }
}