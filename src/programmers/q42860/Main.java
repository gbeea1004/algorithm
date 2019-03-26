package programmers.q42860;

/*
* ABAAAAAAAAABB 문제로 통과못함
* 다음에 다시풀자!
*/
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("ABAAAAAAAAABB"));
    }
}

class Solution {
    public int solution(String name) {
        // 아스키코드 -> A : 65, Z : 90
        char[] alphabets = name.toCharArray();
        int goRightCount = Math.min(91 - alphabets[0], alphabets[0] - 65); // 오른쪽으로만 이동한 횟수
        int goLeftCount = goRightCount; // 왼쪽으로만 이동한 횟수

        for (int i = 1; i < alphabets.length; i++) {
            boolean existA = true;
            for (int j = i; j < alphabets.length; j++) {
                if (alphabets[j] != 'A') {
                    existA = false;
                    break;
                }
            }
            if (existA) {
                break;
            }
            int down = 91 - alphabets[i];
            int up = alphabets[i] - 65;

            goRightCount++;
            goRightCount += down > up ? up : down;
        }

        for (int i = alphabets.length - 1; i >= 1; i--) {
            boolean existA = true;
            for (int j = i; j >= 1; j--) {
                if (alphabets[j] != 'A') {
                    existA = false;
                    break;
                }
            }
            if (existA) {
                break;
            }

            int down = 91 - alphabets[i];
            int up = alphabets[i] - 65;

            goLeftCount++;
            goLeftCount += down > up ? up : down;
        }

        return Math.min(goLeftCount, goRightCount);
    }
}
