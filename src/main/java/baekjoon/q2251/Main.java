package baekjoon.q2251;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] bucket = Arrays.stream(scanner.nextLine().split(" "))
                             .mapToInt(Integer::parseInt)
                             .toArray();

        List<Integer> result = new Solution().solution(bucket);

        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i));
            if (i < result.size() - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);

        scanner.close();
    }
}

class Solution {

    // A -> B, A -> C, B -> A, B -> C, C -> A, C -> B
    private static final int[] from = {0, 0, 1, 1, 2, 2};
    private static final int[] to = {1, 2, 0, 2, 0, 1};
    private List<Integer> result;
    private int[] bucket;
    private boolean[][] visit;

    public List<Integer> solution(int[] bucket) {
        visit = new boolean[201][201];
        this.bucket = bucket;

        bfs();

        return result;
    }

    private void bfs() {
        Queue<Point> points = new LinkedList<>();
        Set<Integer> result = new HashSet<>();
        points.add(new Point(0, 0, bucket[2]));
        visit[0][0] = true;
        result.add(bucket[2]);

        while (!points.isEmpty()) {
            Point point = points.poll();

            for (int i = 0; i < 6; i++) {
                int[] next = {point.a, point.b, point.c};
                next[to[i]] += next[from[i]];
                next[from[i]] = 0;

                // 넣은 곳이 용량 초과일 때
                if (next[to[i]] > bucket[to[i]]) {
                    next[from[i]] = next[to[i]] - bucket[to[i]];
                    next[to[i]] -= next[from[i]];
                }

                // 이미 방문했을 때
                if (visit[next[0]][next[1]]) {
                    continue;
                }

                points.add(new Point(next[0], next[1], next[2]));
                visit[next[0]][next[1]] = true;

                // A 가 비어있으면 C 물의 양 기록
                if (next[0] == 0) {
                    result.add(next[2]);
                }
            }
        }

        this.result = new ArrayList<>(result);
        Collections.sort(this.result);
    }

    class Point {
        private int a;
        private int b;
        private int c;

        public Point(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
