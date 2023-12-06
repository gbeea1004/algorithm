package baekjoon.q1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NewMain {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[][] points = new int[numbers[0] + 1][numbers[0] + 1];
    for (int i = 0; i < numbers[1]; i++) {
      int[] lines = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      points[lines[0]][lines[1]] = 1;
      points[lines[1]][lines[0]] = 1;
    }

    solution(points, numbers[2]);

    br.close();
  }

  private static void solution(int[][] points, int start) {
    boolean[] visitDfs = new boolean[points.length];
    dfs(points, start, visitDfs);
    System.out.println();
    bfs(points, start);
  }

  private static void dfs(int[][] points, int start, boolean[] visit) {
    if (visit[start]) {
      return;
    }

    visit[start] = true;
    System.out.print(start + " ");

    for (int i = 1; i < visit.length; i++) {
      if (points[start][i] == 1 && !visit[i]) {
        dfs(points, i, visit);
      }
    }
  }

  private static void bfs(int[][] points, int start) {
    boolean[] visit = new boolean[points.length];
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    visit[start] = true;
    System.out.print(start + " ");

    while (!queue.isEmpty()) {
      Integer point = queue.poll();
      for (int i = 0; i < points.length; i++) {
        if (points[point][i] == 1 && !visit[i]) {
          queue.add(i);
          visit[i] = true;
          System.out.print(i + " ");
        }
      }
    }
  }
}
