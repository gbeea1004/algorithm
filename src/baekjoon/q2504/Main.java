package baekjoon.q2504;

import java.io.*;
import java.util.Stack;

public class Main {
    // 다시 풀어보기
    // 에러 : 런타임 에러 (][()]

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        Stack<String> stack = new Stack<>();
        int result = 0;
        int number = 0;

        try {
            for (int i = 0; i < input.length(); i++) {
                String current = String.valueOf(input.charAt(i));

                if (current.equals("(") || current.equals("[")) {
                    stack.push(current);
                } else if (current.equals(")")) {
                    if (stack.peek().equals("(")) {
                        stack.pop();
                        stack.push("2");
                    } else {
                        while (!stack.empty()) {
                            String pop = stack.pop();
                            if (pop.equals("[") || pop.equals("(")) {
                                String a = String.valueOf(number * 2);
                                number = 0;
                                stack.push(a);
                                break;
                            } else {
                                number += Integer.parseInt(pop);
                            }
                        }
                    }
                } else if (current.equals("]")) {
                    if (stack.peek().equals("[")) {
                        stack.pop();
                        stack.push("3");
                    } else {
                        while (!stack.empty()) {
                            String pop = stack.pop();
                            if (pop.equals("[") || pop.equals("(")) {
                                String a = String.valueOf(number * 3);
                                number = 0;
                                stack.push(a);
                                break;
                            } else {
                                number += Integer.parseInt(pop);
                            }
                        }

                    }
                }
            }

            while (!stack.empty()) {
                result += Integer.parseInt(stack.pop());
            }
        } catch (Exception e) {
            result = 0;
        }

        bw.write(result + "");
        br.close();
        bw.close();
    }
}
