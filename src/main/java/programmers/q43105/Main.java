package programmers.q43105;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] triangle = new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(solution.solution(triangle));
    }
}

class Solution {
    public int solution(int[][] triangle) {
        int[][] copyTriangle = new int[triangle.length][triangle.length];

        copyTriangle[0][0] = triangle[0][0];
        for (int i = 1; i < triangle.length; i++) {
            copyTriangle[i][0] = copyTriangle[i - 1][0] + triangle[i][0];
            copyTriangle[i][i] = copyTriangle[i - 1][i - 1] + triangle[i][i];
        }

        for (int i = 2; i < triangle.length; i++) {
            for (int j = 1; j < i; j++) {
                copyTriangle[i][j] = Math.max(copyTriangle[i - 1][j - 1], copyTriangle[i - 1][j]) + triangle[i][j];
            }
        }

        int maxNo = copyTriangle[copyTriangle.length - 1][0];
        for (int i = 1; i < triangle.length; i++) {
            int checkNo = copyTriangle[copyTriangle.length - 1][i];
            if (maxNo < checkNo) {
                maxNo = checkNo;
            }
        }
        return maxNo;
    }
}