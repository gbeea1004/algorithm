package baekjoon.q7569;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] tomatoBoxToString = br.readLine().split(" ");
        int boxCount = Integer.parseInt(tomatoBoxToString[2]);
        int row = Integer.parseInt(tomatoBoxToString[1]);
        int column = Integer.parseInt(tomatoBoxToString[0]);

        int[][][] tomatoBox = new int[boxCount][row][column];
        for (int i = 0; i < tomatoBox.length; i++) {
            for (int j = 0; j < row; j++) {
                String[] columnNo = br.readLine().split(" ");
                for (int k = 0; k < column; k++) {
                    tomatoBox[i][j][k] = Integer.parseInt(columnNo[k]);
                }
            }
        }
        bw.write(String.valueOf(bfs(tomatoBox, row, column)));
        bw.flush();
    }

    private static int bfs(int[][][] tomatoBox, int row, int column) {
        // 익은 토마토
        Queue<Dot> ripeTomatos = new LinkedList<>();

        // 왼, 오, 위, 아래, 앞 박스, 뒤 박스
        int[] checkRow = {0, 0, -1, 1};
        int[] checkColumn = {-1, 1, 0, 0};
        int[] checkBox = {-1 ,1};

        for (int i = 0; i < tomatoBox.length; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < column; k++) {
                    if (tomatoBox[i][j][k] == 1) {
                        ripeTomatos.add(new Dot(i, j, k));
                    }
                }
            }
        }

        while (!ripeTomatos.isEmpty()) {
            Dot ripeTomato = ripeTomatos.poll();

            // 왼, 오, 위, 아래 체크
            for (int i = 0; i < 4; i++) {
                int chBoxNo = ripeTomato.getBoxNo();
                int ckRow = ripeTomato.getRow() + checkRow[i];
                int ckColumn = ripeTomato.getColumn() + checkColumn[i];

                // 경계값 체크
                if (ckRow < 0 || ckRow >= row || ckColumn < 0 || ckColumn >= column) {
                    continue;
                }

                if (tomatoBox[chBoxNo][ckRow][ckColumn] == 0) {
                    tomatoBox[chBoxNo][ckRow][ckColumn] = tomatoBox[ripeTomato.getBoxNo()][ripeTomato.getRow()][ripeTomato.getColumn()] + 1;
                    ripeTomatos.add(new Dot(chBoxNo, ckRow, ckColumn));
                }
            }

            // 앞, 뒤 체크
            for (int i = 0; i < checkBox.length; i++) {
                int ckBox = ripeTomato.getBoxNo() + checkBox[i];
                int ckRow = ripeTomato.getRow();
                int ckColumn = ripeTomato.getColumn();
                // 경계값 체크
                if (ckBox < 0 || ckBox >= tomatoBox.length) {
                    continue;
                }

                if (tomatoBox[ckBox][ckRow][ckColumn] == 0) {
                    tomatoBox[ckBox][ckRow][ckColumn] = tomatoBox[ripeTomato.getBoxNo()][ripeTomato.getRow()][ripeTomato.getColumn()] + 1;
                    ripeTomatos.add(new Dot(ckBox, ckRow, ckColumn));
                }
            }
        }

        int max = 0;
        for (int i = 0; i < tomatoBox.length; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < column; k++) {
                    int currentTomato = tomatoBox[i][j][k];
                    if (currentTomato == 0) {
                        return -1;
                    }
                    max = Math.max(max, currentTomato);
                }
            }
        }
        // 1 부터 시작하므로 -1을 해줘야 함
        return max - 1;
    }
}

class Dot {
    private int boxNo;
    private int row;
    private int column;

    public Dot(int boxNo, int row, int column) {
        this.boxNo = boxNo;
        this.row = row;
        this.column = column;
    }

    public int getBoxNo() {
        return boxNo;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return "Dot{" +
                "boxNo=" + boxNo +
                ", row=" + row +
                ", column=" + column +
                '}';
    }
}
