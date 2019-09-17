package coding_test.y2019.kakao_blind2020.q4;

public class Solution {
    public int[] solution(String[] words, String[] queries) {
        int[] answer = new int[queries.length];
        for (String word : words) {
            for (int i = 0; i < queries.length; i++) {
                String query = queries[i];
                if (word.length() == query.length()) {
                    if (isPass(word, query)) {
                        answer[i] += 1;
                    }
                }
            }
        }
        return answer;
    }

    private boolean isPass(String word, String query) {
        for (int i = 0; i < query.length(); i++) {
            if (query.charAt(i) != word.charAt(i) && query.charAt(i) != '?') {
                return false;
            }
        }
        return true;
    }
}
