package coding_test.y2019.groundx.day_20190521.q3;

public class Solution {
    private final String X_WIN = "X";
    private final String O_WIN = "O";
    private final String DRAW = "D";

    public String solution(String[] board) {
        String answer = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char current = board[i].charAt(j);
                if (current == '.') {
                    // 주변 체크 (O가 2개인지) - 8개 방향
                    for (int k = 0; k < 8; k++) {
                        
                    }
                }
            }
        }
        return answer;
    }
}
