package programmers.q42862;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        int[] lost = {2, 5};
        int[] reserve = {5};
        System.out.println(solution.solution(n, lost, reserve));
    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        for (int l : lost) {
            for (int i = 0; i < reserve.length; i++) {
                int current = reserve[i];
                if (l == current) {
                    reserve[i] = -1;
                    break;
                }
                if (l - 1 == current) {
                    reserve[i] = -1;
                    break;
                } else if (l + 1 == current) {
                    reserve[i] = -1;
                    break;
                }
                if (i == reserve.length - 1) {
                    n--;
                }
            }
        }
        return n;
    }
}
