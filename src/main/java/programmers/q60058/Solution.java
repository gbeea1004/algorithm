package programmers.q60058;


import java.util.EmptyStackException;
import java.util.Stack;

public class Solution {

    public String solution(String p) {
        if (p.isEmpty()) return p;
        String[] divisionText = division(p); // divisionText[0] = u, divisionText[1] = v
        if (isCorrect(divisionText[0])) {
            return divisionText[0] + solution(divisionText[1]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(solution(divisionText[1]));
        sb.append(")");
        sb.append(reverseText(deleteFirstAndLastText(divisionText[0])));
        return sb.toString();
    }

    private String reverseText(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                sb.append(')');
            } else {
                sb.append('(');
            }
        }
        return sb.toString();
    }

    private String deleteFirstAndLastText(String text) {
        return text.substring(1, text.length() - 1);
    }

    private boolean isCorrect(String u) {
        Stack<Character> stack = new Stack<>();
        try {
            for (int i = 0; i < u.length(); i++) {
                char text = u.charAt(i);
                if (text == '(') {
                    stack.add(text);
                } else {
                    stack.pop();
                }
            }
        } catch (EmptyStackException e) {
            return false;
        }
        return true;
    }

    private String[] division(String p) {
        int endIndex = endIndex(p);
        String u = p.substring(0, endIndex);
        String v = p.substring(endIndex);
        return new String[]{u, v};
    }

    public int endIndex(String p) {
        int openCount = 0;
        int closeCount = 0;
        int size = p.length();

        for (int i = 0; i < size; i++) {
            char text = p.charAt(i);
            if (text == '(') {
                openCount++;
            } else {
                closeCount++;
            }

            if ((openCount > 0 && closeCount > 0) && openCount == closeCount) {
                return i + 1;
            }
        }
        return size;
    }
}
