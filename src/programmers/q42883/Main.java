package programmers.q42883;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.solution("1924", 2));
        System.out.println(solution.solution("12345", 3));
    }
}

class Solution {
    private StringBuilder sb = new StringBuilder();

    public String solution(String number, int k) {
        int noLen = number.length() - k;
        startToEnd(0, noLen, number);

        return sb.toString();
    }

    public void startToEnd(int startIndex, int noLen, String number) {
        if (noLen == 0) {
            return;
        }
        int maxIndex = startIndex;
        for (int i = startIndex + 1; i < number.length(); i++) {
            if (number.charAt(maxIndex) < number.charAt(i)) {
                if (number.length() - i < noLen) {
                    break;
                }
                maxIndex = i;
            }
        }
        sb.append(number.charAt(maxIndex));
        startToEnd(++maxIndex, --noLen, number);
    }
}
