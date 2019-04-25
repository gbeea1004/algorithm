package baekjoon.q7576;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] matrix = br.readLine().split(" ");
        int row = Integer.parseInt(matrix[1]);
        int column = Integer.parseInt(matrix[0]);

        int[][] tomatos = new int[row][column];


        for (int i = 0; i < row; i++) {
            String[] no = br.readLine().split(" ");
            for (int j = 0; j < column; j++) {
                tomatos[i][j] = Integer.parseInt(no[j]);
            }
        }


//        // 입력값 출력해보기
//        for (int[] tomato : tomatos) {
//            System.out.println(Arrays.toString(tomato));
//        }

        // 위, 아래, 왼, 오 체크
        // BFS
        bw.write(String.valueOf(bfs(tomatos, row, column)));

        bw.flush();
    }

    private static int bfs(int[][] tomatos, int row, int column) {
        // 상, 하, 좌, 우
        int[] dRow = {-1, 1, 0, 0};
        int[] dColumn = {0, 0, -1, 1};

        Queue<Dot> ripeTomatos = new LinkedList<>(); // 익은 토마토 위치 저장
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (tomatos[i][j] == 1) {
                    ripeTomatos.add(new Dot(i, j));
                }
            }
        }

        while (!ripeTomatos.isEmpty()) {
            Dot ripeTomato = ripeTomatos.poll();
            // 상, 하, 좌, 우 => 4방향 체크
            for (int i = 0; i < 4; i++) {
                int checkRow = ripeTomato.getRow() + dRow[i];
                int checkColumn = ripeTomato.getColumn() + dColumn[i];

                // 범위 밖 제외
                if (checkRow < 0 || checkRow > row - 1 || checkColumn < 0 || checkColumn > column - 1) {
                    continue;
                }

                // 익지 않은 토마토 아니면 제외
                if (tomatos[checkRow][checkColumn] != 0) {
                    continue;
                }

                tomatos[checkRow][checkColumn] = tomatos[ripeTomato.getRow()][ripeTomato.getColumn()] + 1;
                ripeTomatos.add(new Dot(checkRow, checkColumn));
            }
        }

        int max = 0;
        // 토마토가 익지 못하는 상황일 경우
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (tomatos[i][j] == 0) {
                    return -1;
                }
                max = Math.max(max, tomatos[i][j]);
            }
        }
        // 1부터 시작하므로 1을 빼줘야 함
        return max - 1;
    }
}

class Dot {
    private int row;
    private int column;

    public Dot(int x, int y) {
        this.row = x;
        this.column = y;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}

