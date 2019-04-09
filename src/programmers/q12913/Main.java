package programmers.q12913;

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
        int[] copyLand = new int[land[0].length];
        int[] limitIndex = new int[land[0].length];

        for (int i = 0; i < land[0].length; i++) {
            copyLand[i] = land[0][i];
            limitIndex[i] = i;
        }

        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                int max = -1;
                int limit = -1;
                for (int k = 0; k < land[0].length; k++) {
                    if (limitIndex[j] == k) {
                        continue;
                    }
                    if (max < land[i][k]) {
                        max = land[i][k];
                        limit = k;
                    }
                }
                limitIndex[j] = limit;
                copyLand[j] += max;
            }
        }

        int answer = 0;
        for (int i : copyLand) {
            System.out.println(i);
            if (answer < i) {
                answer = i;
            }
        }

        return answer;
    }
}