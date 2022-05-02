package programmers.q12919;

public class Solution {

    private static final String KIM = "Kim";

    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals(KIM)) {
                return print(i);
            }
        }
        throw new IllegalArgumentException("김서방을 찾을 수 없습니다.");
    }

    private String print(int position) {
        return String.format("김서방은 %d에 있다", position);
    }
}
