package codesignal.reverse_in_parentheses;

import java.util.Stack;

public class Solution {
    String reverseInParentheses(String inputString) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int bracketSize = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char currentText = inputString.charAt(i);
            if (currentText == '(') {
                stack.push('(');
                bracketSize++;
            } else if (currentText == ')') {
                StringBuilder texts = new StringBuilder();
                while (stack.peek() != '(') {
                    texts.append(stack.pop());
                }
                stack.pop(); // '(' 제거
                String text = texts.toString();
                if (bracketSize >= 2) {
                    for (int j = 0; j < text.length(); j++) {
                        stack.add(text.charAt(j));
                    }
                } else {
                    sb.append(text);
                }
                bracketSize--;
            } else if (bracketSize > 0) {
                stack.add(currentText);
            } else {
                sb.append(currentText);
            }
        }
        return sb.toString();
    }
}
