package programmers.q84021;

import java.util.*;

public class Solution {
    private static final int[] X_DIR = {1, -1, 0, 0}; // 상 하 좌 우
    private static final int[] Y_DIR = {0, 0, -1, 1};
    private int answer;
    private int count;
    private List<Point> blocks;
    private Map<String, Point> blockStore = new HashMap<>();

    public int solution(int[][] game_board, int[][] table) {
        // game_board 의 0을 1로, 1을 0으로 바꿈 (1이면 비어있는 곳)
        changeGameBoardNumbers(game_board);

        for (int i = 0; i < game_board.length; i++) {
            System.out.println(Arrays.toString(game_board[i]));
        }

        for (int i = 0; i < game_board.length; i++) {
            for (int j = 0; j < game_board[0].length; j++) {
                if (game_board[i][j] == 1) {
                    String blockString = bfs(game_board, i, j);
                    Point point = blockStore.getOrDefault(blockString, new Point(0, count));
                    point.x++;
                    blockStore.put(blockString, point);
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            table = rotate(table);
            int[][] cloneTable = cloneTable(table);

            for (int x = 0; x < cloneTable.length; x++) {
                for (int y = 0; y < cloneTable[0].length; y++) {
                    if (cloneTable[x][y] == 1) {
                        String blockString = bfs(cloneTable, x, y);
                        if (blockStore.containsKey(blockString)) {
                            for (Point block : blocks) {
                                table[block.x][block.y] = 0;
                            }
                            Point point = blockStore.get(blockString);
                            answer += point.y; // 개수 더하기
                            --point.x; // 중복 값 1개 감소
                            if (point.x == 0) {
                                blockStore.remove(blockString);
                            } else {
                                blockStore.put(blockString, point);
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }

    private int[][] cloneTable(int[][] table) {
        int[][] cloneTable = new int[table.length][table.length];
        for (int j = 0; j < table.length; j++) {
            cloneTable[j] = table[j].clone();
        }
        return cloneTable;
    }

    private int[][] rotate(int[][] board) {
        int[][] newBoard = new int[board.length][board.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                newBoard[j][board.length - i - 1] = board[i][j];
            }
        }
        return newBoard;
    }

    private void changeGameBoardNumbers(int[][] game_board) {
        for (int i = 0; i < game_board.length; i++) {
            for (int j = 0; j < game_board[0].length; j++) {
                game_board[i][j] = game_board[i][j] == 0 ? 1 : 0;
            }
        }
    }

    private String bfs(int[][] game_board, int x, int y) {
        int minX = 987654321;
        int minY = 987654321;
        int maxX = 0;
        int maxY = 0;
        count = 0;
        blocks = new ArrayList<>();

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        game_board[x][y] = 0;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            count++;
            minX = Math.min(point.x, minX);
            minY = Math.min(point.y, minY);
            maxX = Math.max(point.x, maxX);
            maxY = Math.max(point.y, maxY);
            blocks.add(point);

            for (int i = 0; i < 4; i++) {
                int nextX = point.x + X_DIR[i];
                int nextY = point.y + Y_DIR[i];

                // 범위 체크
                if (nextX < 0 || nextY < 0 || nextX >= game_board.length || nextY >= game_board[0].length) {
                    continue;
                }

                // 빈 공간이 아닌경우
                if (game_board[nextX][nextY] == 0) {
                    continue;
                }

                game_board[nextX][nextY] = 0;
                queue.add(new Point(nextX, nextY));
            }
        }
        return makeStringKey(minX, minY, maxX, maxY, blocks);
    }

    private String makeStringKey(int minX, int minY, int maxX, int maxY, List<Point> blocks) {
        int[][] checkBlocks = new int[maxX - minX + 1][maxY - minY + 1];
        for (Point block : blocks) {
            checkBlocks[block.x - minX][block.y - minY] = 1;
        }
        StringBuilder blockString = new StringBuilder();
        for (int i = 0; i < checkBlocks.length; i++) {
            for (int j = 0; j < checkBlocks[0].length; j++) {
                blockString.append(checkBlocks[i][j]);
            }
            blockString.append("n");
        }
        return blockString.toString();
    }

    class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
