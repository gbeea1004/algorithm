package programmers.q12900;

public class Solution {
    public int solution(int n) {
        int[] tiles = new int[60001];
        tiles[0] = 0;
        tiles[1] = 1;
        tiles[2] = 2;
        for (int i = 3; i < tiles.length; i++) {
            tiles[i] = (tiles[i - 1] + tiles[i - 2]) % 1000000007;
        }
        return tiles[n];
    }
}
