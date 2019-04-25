package programmers.q12913;

/*
* 풀이법 : 별도의 배열을 만들면 테스트에서 실패하게 된다.
*         기존 배열을 활용하라.
* */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        int[][] land = {{1, 3, 5, 4}, {2, 1, 9, 8}, {1, 2, 3, 100}};
        System.out.println(solution.solution(land));
    }
}

class Solution {
    int solution(int[][] land) {
        for (int i = 0; i < land.length - 1; i++) {
            land[i + 1][0] += Math.max(land[i][1], Math.max(land[i][2], land[i][3]));
            land[i + 1][1] += Math.max(land[i][0], Math.max(land[i][2], land[i][3]));
            land[i + 1][2] += Math.max(land[i][0], Math.max(land[i][1], land[i][3]));
            land[i + 1][3] += Math.max(land[i][0], Math.max(land[i][1], land[i][2]));
        }

        int max = land[land.length - 1][0];
        for (int i = 0; i < land[0].length; i++) {
            if (max < land[land.length - 1][i]) {
                max = land[land.length - 1][i];
            }
        }
        return max;
    }
}