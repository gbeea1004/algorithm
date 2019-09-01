package coding_test.y2019.groundx.day_20190521.q2;

import java.util.Stack;

public class Solution {
    public String solution(String compressed) {
        StringBuilder answer = new StringBuilder();
        StringBuilder addText = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < compressed.length(); i++) {
            char currentText = compressed.charAt(i);

            // int 체크()
            if (49 <= currentText && currentText <= 57) {
                StringBuilder sb = new StringBuilder();
                // 10의 자리 체크
                if (48 <= compressed.charAt(i + 1) && compressed.charAt(i + 1) <= 57) {
                    // 100의 자리 체크 (return 1000 이하이므로)
                    if (48 <= compressed.charAt(i + 2) && compressed.charAt(i + 2) <= 57) {
                        sb.append(currentText - '0');
                        sb.append(compressed.charAt(i + 1) - '0');
                        sb.append(compressed.charAt(i + 2) - '0');
                        stack.push(Integer.parseInt(sb.toString()));
                        i += 3;
                        continue;
                    }
                    sb.append(currentText - '0');
                    sb.append(compressed.charAt(i + 1) - '0');
                    stack.push(Integer.parseInt(sb.toString()));
                    i += 2;
                    continue;
                }
                stack.push(currentText - '0');
                i++;
                continue;
            }

            if (currentText == ')') {
                int count = stack.pop();
                if (stack.empty()) {
                    addText.append(answer.toString());
                    answer.delete(0, answer.length());
                    String text = addText.toString();
                    for (int j = 1; j < count; j++) {
                        addText.append(text);
                    }
                    stack.push(-1);
                    continue;
                }
                String text = answer.toString();
                answer.delete(0, answer.length());
                for (int j = 0; j < count; j++) {
                    addText.append(text);
                }
            } else if (stack.peek() == -1) {
                // 해당문자 더하기
                addText.append(currentText);
            } else {
                // 해당문자 더하기
                answer.append(currentText);
            }
        }
        return addText.toString();
    }
}
