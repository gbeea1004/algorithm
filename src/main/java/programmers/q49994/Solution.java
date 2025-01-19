package programmers.q49994;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(String dirs) {
        Map<String, Void> visited = new HashMap<>();
        int result = 0;
        int x = 0;
        int y = 0;

        for (String dir : dirs.split("")) {
            Point point = new Point(x, y, dir);
            int nextX = point.x;
            int nextY = point.y;

            if (nextX < -5 || nextY < -5 || nextX > 5 || nextY > 5) {
                continue;
            }

            // 방문 안했으면
            if (!visited.containsKey("" + x + y + nextX + nextY) || !visited.containsKey("" + nextX + nextY + x + y)) {
                result++;
            }

            visited.put("" + x + y + nextX + nextY, null);
            visited.put("" + nextX + nextY + x + y, null); // 역으로 오는 경우도 저장
            x = nextX;
            y = nextY;
        }

        return result;
    }


    private static class Point {

        private final int x;
        private final int y;

        public Point(int x, int y, String dir) {
            if (dir.equals("U")) {
                this.x = x;
                this.y = y + 1;
                return;
            }

            if (dir.equals("D")) {
                this.x = x;
                this.y = y - 1;
                return;
            }

            if (dir.equals("L")) {
                this.x = x - 1;
                this.y = y;
                return;
            }

            if (dir.equals("R")) {
                this.x = x + 1;
                this.y = y;
                return;
            }

            throw new IllegalArgumentException("잘못된 방향입니다.");
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
