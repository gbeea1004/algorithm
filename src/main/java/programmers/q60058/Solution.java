package programmers.q60058;

import java.util.Stack;

public class Solution {

    public String solution(String p) {
        if (p.isEmpty()) {
            return p;
        }

        Text u = new Text();
        Text v = new Text();
        separateText(p, u, v);

        return isProperText(u.getText()) ?
                u.getText() + solution(v.getText())
                : "(" + solution(v.getText()) + ")" + removeAndReverseText(u.getText());
    }

    private void separateText(String p, Text u, Text v) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        // ')' 로 시작하는 경우
        if (p.charAt(0) == ')') {
            sb.append(p.charAt(0));
            int openTextCount = 0;
            int closeTextCount = 1;
            for (int i = 1; i < p.length(); i++) {
                char word = p.charAt(i);
                if (word == '(') {
                    openTextCount++;
                } else {
                    closeTextCount++;
                }
                sb.append(word);
                if (openTextCount == closeTextCount) {
                    u.setText(sb.toString());
                    v.setText(p.substring(i + 1));
                    break;
                }
            }
            return;
        }

        // '(' 로 시작하는 경우
        for (int i = 0; i < p.length(); i++) {
            char word = p.charAt(i);
            if (word == ')') {
                try {
                    stack.pop();
                } catch (Exception e) {
                    v.setText(p.substring(i));
                    break;
                }
            } else if (word == '(') {
                stack.push(word);
            }
            sb.append(word);
        }
        u.setText(sb.toString());
    }

    private boolean isProperText(String u) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < u.length(); i++) {
            char word = u.charAt(i);
            if (word == '(') {
                stack.push(word);
            } else {
                try {
                    stack.pop();
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return true;
    }

    private String removeAndReverseText(String u) {
        u = u.substring(1, u.length() - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < u.length(); i++) {
            char word = u.charAt(i);
            if (word == '(') {
                sb.append(')');
            } else {
                sb.append('(');
            }
        }
        return sb.toString();
    }
}

class Text {

    private String text;

    public Text() {
        text = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
