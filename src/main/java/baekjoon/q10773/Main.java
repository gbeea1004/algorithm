package baekjoon.q10773;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print(Solution.solution(numbers));
    }
}

class Solution {
    public static int solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        for (int number : numbers) {
            inputValue(stack, number);
        }
        return sum(stack);
    }

    private static void inputValue(Stack<Integer> stack, int number) {
        if (stack.size() != 0 && number == 0) {
            stack.pop();
            return;
        }
        stack.push(number);
    }

    private static int sum(Stack<Integer> stack) {
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}