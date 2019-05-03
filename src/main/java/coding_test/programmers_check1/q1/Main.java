package coding_test.programmers_check1.q1;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("a B z", 4));
    }
}

class Solution {
    public String solution(String s, int n) {
        char[] input = s.toCharArray();
        for (int i = 0; i < input.length; i++) {
            int currentAlpha = input[i];
            // 공백 체크
            if (currentAlpha == 32) {
                continue;
            }

            // 소문자 체크
            if (currentAlpha >= 97 && currentAlpha <= 122) {
                currentAlpha += n;
                if (currentAlpha > 122) {
                    input[i] = (char) (96 + currentAlpha - 122);
                } else {
                    input[i] = (char) currentAlpha;
                }
                continue;
            }

            // 대문자 체크
            if (currentAlpha >= 65 && currentAlpha <= 90) {
                currentAlpha += n;
                if (currentAlpha > 90) {
                    input[i] = (char) (64 + currentAlpha - 90);
                } else {
                    input[i] = (char) currentAlpha;
                }
            }
        }

        StringBuilder answer = new StringBuilder();
        for (char alphabet : input) {
            answer.append(alphabet);
        }
        return answer.toString();
    }
}
