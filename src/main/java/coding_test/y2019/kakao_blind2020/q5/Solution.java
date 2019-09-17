package coding_test.y2019.kakao_blind2020.q5;

public class Solution {
    public int[][] solution(int n, int[][] build_frame) {
        // 막대기 : 1, 보 : 2
        int[][] land = new int[n + 1][n + 1];
        int hit = 0;
        for (int i = 0; i < build_frame.length; i++) {
            int x = build_frame[i][0];
            int y = build_frame[i][1];

            if (isInsertTable(build_frame[i][3])) {
                // 삽입
                if (isStick(build_frame[i][2])) {
                    // 기둥
                    if (y == 0 || (y > 0 && land[y - 1][x] == 1) || (x > 0 && land[y][x - 1] == 2)) {
                        land[y][x] = 1;
                        hit++;
                    }
                }

                if (!isStick(build_frame[i][2])) {
                    // 보
                    if ((y > 0 && land[y - 1][x] == 1)
                            || (x < land.length - 1 && y > 0 && land[y - 1][x + 1] == 1)
                            || (x > 0 && x < land.length - 1 && land[y][x - 1] == 2 && land[y][x + 1] == 2)) {
                        land[y][x] = 2;
                        hit++;
                    }
                }
            }

            if (!isInsertTable(build_frame[i][3])) {
                // 삭제
                if (isStick(build_frame[i][2])) {
                    // 기둥
                    if ((x > 0 && y < land.length - 1 && land[y + 1][x - 1] == 2 && x < land.length - 1 && y < land.length - 1 && land[y + 1][x + 1] == 2)
                            || y < land.length - 1 && land[y + 1][x] == 0) {
                        land[y][x] = 0;
                        hit--;
                    }
                }

                if (!isStick(build_frame[i][2])) {
                    // 보
                    if (y > 0 && x < land.length - 1 && land[y - 1][x] == 1 && land[y - 1][x + 1] == 1) {
                        land[y][x] = 0;
                        hit--;
                    }

                }
            }
        }
        int[][] answer = new int[hit][3];
        int cnt = 0;
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land.length; j++) {
                if (land[j][i] > 0) {
                    answer[cnt][0] = i;
                    answer[cnt][1] = j;
                    answer[cnt][2] = land[j][i] - 1;
                    cnt++;
                }
            }
        }

        return answer;
    }

    private boolean isInsertTable(int num) {
        return num == 1;
    }

    private boolean isStick(int num) {
        return num == 0;
    }
}
