package baekjoon.q1377;

import java.util.Scanner;

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
    public static class Number {
        private int index;
        private int value;

        public Number(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    // numbers[0] 은 빈 값
    public static int solution(int[] numbers) {
        Number[] inputNumbers = new Number[numbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            inputNumbers[i] = new Number(i, numbers[i]);
        }
        quickSort(inputNumbers, 0, inputNumbers.length - 1);
        for (Number inputNumber : inputNumbers) {
            System.out.print(inputNumber.value + " ");
        }
        System.out.println();
        int maxValue = 0;
        for (int i = 0; i < numbers.length; i++) {
            maxValue = Math.max(maxValue, inputNumbers[i].index - i);
            System.out.print(inputNumbers[i].index - i + " ");
        }
        return maxValue + 1;
    }

    public static void quickSort(Number[] arr, int l, int r) {
        int left = l;
        int right = r;
        int pivot = arr[(left + right) / 2].value;

        do {
            while (arr[left].value < pivot) left++;
            while (arr[right].value > pivot) right--;

            if (left <= right) {
                swap(left, right, arr);
                left++;
                right--;
            }
        } while (left <= right);

        if (l < right) quickSort(arr, l, right);
        if (r > left) quickSort(arr, left, r);
    }

    private static void swap(int indexA, int indexB, Number[] numbers) {
        Number tmp = numbers[indexA];
        numbers[indexA] = numbers[indexB];
        numbers[indexB] = tmp;
    }
}
