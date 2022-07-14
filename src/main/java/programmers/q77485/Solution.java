package programmers.q77485;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    private List<Integer> result;

    public Integer[] solution(int rows, int columns, int[][] queries) {
        int[][] board = createBoard(rows, columns);
        result = new ArrayList<>();

        for (int[] query : queries) {
            rotate(board, query);
        }

        return result.toArray(new Integer[0]);
    }

    private void rotate(int[][] board, int[] query) {
        int startX = query[0] - 1;
        int startY = query[1] - 1;
        int endX = query[2] - 1;
        int endY = query[3] - 1;

        int[] boardTop = new int[endY - startY + 1]; // 상
        int[] boardBottom = new int[endY - startY + 1]; // 하
        for (int i = 0; i < boardTop.length; i++) {
            boardTop[i] = board[startX][startY + i];
            boardBottom[i] = board[endX][startY + i];
        }
        int[] boardLeft = new int[endX - startX + 1]; // 좌
        int[] boardRight = new int[endX - startX + 1]; // 우
        for (int i = 0; i < boardRight.length; i++) {
            boardLeft[i] = board[startX + i][startY];
            boardRight[i] = board[startX + i][endY];
        }

        int minTop = Arrays.stream(boardTop)
                           .min()
                           .getAsInt();
        int minBottom = Arrays.stream(boardBottom)
                              .min()
                              .getAsInt();
        int minLeft = Arrays.stream(boardLeft)
                              .min()
                              .getAsInt();
        int minRight = Arrays.stream(boardRight)
                              .min()
                              .getAsInt();

        result.add(Math.min(Math.min(minTop, minBottom), Math.min(minLeft, minRight)));

        int index = 0;
        for (int i = startY; i < endY; i++) {
            board[startX][i + 1] = boardTop[index]; // 상
            board[endX][i] = boardBottom[index + 1]; // 하
            index++;
        }
        index = 0;
        for (int i = startX; i < endX; i++) {
            board[i][startY] = boardLeft[index + 1]; // 좌
            board[i + 1][endY] = boardRight[index]; // 우
            index++;
        }
    }

    private int[][] createBoard(int rows, int columns) {
        int[][] board = new int[rows][columns];
        int no = 1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = no++;
            }
        }
        return board;
    }
}
