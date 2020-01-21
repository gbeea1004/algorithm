package programmers.q60059;

public class Solution {
    private int[][] key;
    private int[][] lock;

    public boolean solution(int[][] key, int[][] lock) {
        final int rotateCount = 4;
        this.key = key;
        this.lock = lock;

        int[][] copyLock = createExpandedLock(); // 확장 Lock 생성

        for (int r = 0; r < rotateCount; r++) {

            // 왼쪽 끝 부터 오른쪽 아래까지 비교
            int to = copyLock.length - key.length;
            for (int i = 0; i <= to; i++) {
                for (int j = 0; j <= to; j++) {
                    // key 삽입
                    int x = 0;
                    int y;
                    for (int k = i; k < key.length + i; k++) {
                        y = 0;
                        for (int l = j; l < key.length + j; l++) {
                            copyLock[k][l] += key[x][y++];
                        }
                        x++;
                    }

                    if (isFitKeyToLock(copyLock)) {
                        return true;
                    }
                    copyLock = createExpandedLock();
                }
            }

            // 회전
            rotateKey();
        }
        return false;
    }

    private int[][] createExpandedLock() {
        int expandedSize = lock.length + (key.length - 1) * 2;
        return insertLockToCenter(new int[expandedSize][expandedSize]);
    }

    private int[][] insertLockToCenter(int[][] copyLock) {
        int centerStartIndex = key.length - 1;
        int centerEndIndex = centerStartIndex + 3;

        int x = 0;
        int y;
        for (int i = centerStartIndex; i < centerEndIndex; i++) {
            y = 0;
            for (int j = centerStartIndex; j < centerEndIndex; j++) {
                copyLock[i][j] = lock[x][y++];
            }
            x++;
        }

        return copyLock;
    }

    private boolean isFitKeyToLock(int[][] copyLock) {
        int centerStartIndex = key.length - 1;
        int centerEndIndex = centerStartIndex + 3;

        for (int i = centerStartIndex; i < centerEndIndex; i++) {
            for (int j = centerStartIndex; j < centerEndIndex; j++) {
                if (copyLock[i][j] != 1) return false;
            }
        }
        return true;
    }

    private void rotateKey() {
        int keySize = key.length;
        int[][] copyKey = new int[keySize][keySize];

        for (int i = 0; i < keySize; i++) {
            for (int j = 0; j < keySize; j++) {
                copyKey[i][j] = key[keySize - 1 - j][i];
            }
        }

        for (int i = 0; i < copyKey.length; i++) {
            key[i] = copyKey[i].clone();
        }

//        this.key = copyKey; 아놔,, 이것때문에 하루종일 걸렸네 (TODO : 얕은복사 / 깊은복사 공부하기)
    }
}
