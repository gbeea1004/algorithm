package programmers.q81302;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    private static final int[] X_DIR = {-1, 1, 0, 0};
    private static final int[] Y_DIR = {0, 0, -1, 1};
    private final String PERSON = "P";
    private final String PARTITION = "X";

    public int[] solution(String[][] places) {
        List<Integer> answer = new ArrayList<>();

        for (String[] place : places) {
            String[][] placesOfRoom = toSplit(place);
            int valid = isValidDir(placesOfRoom) ? 1 : 0;
            answer.add(valid);
        }

        return answer.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    }

    private String[][] toSplit(String[] place) {
        String[][] result = new String[place.length][place[0].length()];
        for (int i = 0; i < place.length; i++) {
            result[i] = place[i].split("");
        }
        return result;
    }

    private boolean isValidDir(String[][] placesOfRoom) {
        for (int i = 0; i < placesOfRoom.length; i++) {
            for (int j = 0; j < placesOfRoom[0].length; j++) {
                if (placesOfRoom[i][j].equals(PERSON)) {
                    if (!bfs(i, j, placesOfRoom)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean bfs(int x, int y, String[][] placesOfRoom) {
        boolean[][] visited = new boolean[placesOfRoom.length][placesOfRoom[0].length];
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = point.getX() + X_DIR[i];
                int nextY = point.getY() + Y_DIR[i];

                // 범위를 넘어가는가
                if (nextX < 0 || nextY < 0 || nextX >= placesOfRoom.length || nextY >= placesOfRoom[0].length) {
                    continue;
                }

                // 거리두기를 만족하는가
                int manhattan = Math.abs(x - nextX) + Math.abs(y - nextY);
                if (manhattan > 2) {
                    continue;
                }

                // 이미 방문했는가
                if (visited[nextX][nextY]) {
                    continue;
                }

                visited[nextX][nextY] = true;
                String place = placesOfRoom[nextX][nextY];
                // 파티션인가
                if (place.equals(PARTITION)) {
                    continue;
                }

                // 사람인가
                if (place.equals(PERSON)) {
                    return false;
                }

                queue.add(new Point(nextX, nextY));
            }
        }
        return true;
    }
}

class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
