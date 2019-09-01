package coding_test.y2019.kakao.intern;

public class Main4 {
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        int k = 3;
        String[] user_scores = {"alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110"};
        System.out.println(solution.solution(k, user_scores));
    }
}

class Solution4 {
    public int solution(int K, String[] user_scores) {
        int answer = 0;
        for (String user_score : user_scores) {
            String[] a = user_score.split(" ");
        }
        return answer;
    }
}

