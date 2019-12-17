package baekjoon.q2529;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        String[] inequality = scanner.nextLine().split(" ");

        String[] result = Solution.solution(k, inequality);
        for (String number : result) {
            System.out.println(number);
        }
    }
}

class Solution {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;
    private static final String GREATER_THAN_LEFT = "<";
    private static final String GREATER_THAN_RIGHT = ">";
    private static List<String> numbers;
    private static boolean[] visited;
    private static String[] inequality;
    private static int finishSize;

    public static String[] solution(int k, String[] inequality) {
        visited = new boolean[10];
        numbers = new ArrayList<>();
        Solution.inequality = inequality;
        Solution.finishSize = k;

        for (int i = MIN_NUMBER; i <= MAX_NUMBER; i++) {
            visited[i] = true;
            dfs(i, 0, String.valueOf(i));
        }

        String[] result = new String[2];
        result[0] = numbers.get(numbers.size() - 1);
        result[1] = numbers.get(0);
        return result;
    }

    private static void dfs(int currentNo, int currentSize, String totalNo) {
        // 자리수 다 맞춤 - 종료
        if (currentSize == finishSize) {
            numbers.add(totalNo);
            return;
        }

        if (inequality[currentSize].equals(GREATER_THAN_LEFT)) {
            for (int i = MIN_NUMBER; i <= MAX_NUMBER; i++) {
                if (!visited[i]) {
                    if (i > currentNo) {
                        visited[i] = true;
                        dfs(i, ++currentSize, totalNo + i);
                        visited[i] = false;
                        currentSize--;
                    }
                }
            }
        } else if (inequality[currentSize].equals(GREATER_THAN_RIGHT)) {
            for (int i = MIN_NUMBER; i <= MAX_NUMBER; i++) {
                if (!visited[i]) {
                    if (i < currentNo) {
                        visited[i] = true;
                        dfs(i, ++currentSize, totalNo + i);
                        visited[i] = false;
                        currentSize--;
                    }
                }
            }
        }
        visited[currentNo] = false; // 백 트래킹
    }
}
