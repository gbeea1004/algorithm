package baekjoon.q2252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());
        int[][] students = new int[M][2];
        for (int i = 0; i < M; i++) {
            students[i] = Arrays.stream(br.readLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();
        }

        System.out.println(new Solution().solution(N, students));

        br.close();
    }
}

class Solution {

    public String solution(int n, int[][] students) {
        // 진입 차수
        int[] degrees = createDegrees(n + 1, students);
        // 위상 정렬 그래프
        List<List<Integer>> graph = createTopologicalGraph(n + 1, students);

        Queue<Integer> queue = new LinkedList<>();

        // 진입차수 0 이면 큐에 넣음
        addDegreeZero(degrees, queue);

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            Integer studentNo = queue.poll();

            sb.append(studentNo + " ");

            // studentNo 보다 뒤에 있는 학생 리스트
            List<Integer> nextStudents = graph.get(studentNo);
            for (int i = 0; i < nextStudents.size(); i++) {
                Integer nextStudentNo = nextStudents.get(i);

                degrees[nextStudentNo]--;

                if (degrees[nextStudentNo] == 0) {
                    queue.add(nextStudentNo);
                }
            }
        }

        return sb.toString().trim();
    }

    private int[] createDegrees(int size, int[][] students) {
        int[] degrees = new int[size];

        for (int[] student : students) {
            degrees[student[1]]++;
        }

        return degrees;
    }

    private List<List<Integer>> createTopologicalGraph(int size, int[][] students) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= size; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] student : students) {
            int a = student[0];
            int b = student[1];

            graph.get(a).add(b);
        }

        return graph;
    }

    private void addDegreeZero(int[] degrees, Queue<Integer> queue) {
        for (int i = 1; i < degrees.length; i++) {
            if (degrees[i] == 0) {
                queue.add(i);
            }
        }
    }
}
