package coding_test.y2019.kakao_blind2020.q2;

import java.util.EmptyStackException;
import java.util.Stack;

public class Solution {
    private StringBuilder result = new StringBuilder();

    public String solution(String p) {
        if (p.equals("")) {
            return "";
        }

        String u; // 균형잡힘 괄호 문자열
        String v;

        if (isSuccess(p)) {
            return p;
        }

        int countOfBracketStart = 0;
        int countOfBracketEnd = 0;
        int index = 0;

        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                countOfBracketStart++;
            } else {
                countOfBracketEnd++;
            }

            if (countOfBracketStart == countOfBracketEnd) {
                index = i;
                break;
            }
        }
        u = p.substring(0, index + 1);
        v = p.substring(index + 1);

        if (isSuccess(u)) {
            result.append(u);
            return solution(v);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(solution(v));
            sb.append(")");

            String[] text = u.split("");
            for (int i = 1; i < text.length - 1; i++) {
                if (text[i].equals("(")) {
                    sb.append(")");
                } else {
                    sb.append("(");
                }
            }
            result.append(sb.toString());
        }
        return result.toString();
    }

    private boolean isSuccess(String p) {
        try {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < p.length(); i++) {
                char currentText = p.charAt(i);
                if (currentText == '(') {
                    stack.push(currentText);
                } else {
                    stack.pop();
                }
            }
            return true;
        } catch (EmptyStackException ignored) {
            return false;
        }
    }
}
