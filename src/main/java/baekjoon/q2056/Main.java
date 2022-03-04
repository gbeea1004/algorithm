package baekjoon.q2056;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        List<int[]> works = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int[] work = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
            works.add(work);
        }

        System.out.println(new Solution().solution(works));

        br.close();
    }
}

class Solution {

    public int solution(List<int[]> works) {
        // 진입 차수
        int[] degree = createDegree(works);
        int[] workTimes = createWorkTimes(works);
        List<List<Integer>> graph = createGraph(works);
        Queue<Integer> queue = new LinkedList<>();

        // 진입 차수 0 이면 큐에 넣기
        addQueueWhenDegreeZero(queue, degree);

        int[] resultTimes = createResultTimes(workTimes);
        while (!queue.isEmpty()) {
            Integer workNo = queue.poll();

            for (Integer nextWorkNo : graph.get(workNo)) {
                degree[nextWorkNo]--;

                resultTimes[nextWorkNo] = Math.max(resultTimes[nextWorkNo], resultTimes[workNo] + workTimes[nextWorkNo]);

                if (degree[nextWorkNo] == 0) {
                    queue.add(nextWorkNo);
                }
            }
        }

        return Arrays.stream(resultTimes).max().getAsInt();
    }

    private int[] createResultTimes(int[] workTimes) {
        int[] resultTimes = new int[workTimes.length];
        for (int i = 1; i < resultTimes.length; i++) {
            resultTimes[i] = workTimes[i];
        }
        return resultTimes;
    }

    private int[] createDegree(List<int[]> works) {
        int[] degree = new int[works.size() + 1];

        for (int i = 0; i < works.size(); i++) {
            degree[i + 1] = works.get(i)[1];
        }

        return degree;
    }

    private int[] createWorkTimes(List<int[]> works) {
        int[] workTimes = new int[works.size() + 1];

        for (int i = 0; i < works.size(); i++) {
            workTimes[i + 1] = works.get(i)[0];
        }

        return workTimes;
    }

    private List<List<Integer>> createGraph(List<int[]> works) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= works.size(); i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < works.size(); i++) {
            int[] work = works.get(i);

            if (work[1] == 0) {
                continue;
            }

            for (int j = 2; j < work.length; j++) {
                graph.get(work[j]).add(i + 1);
            }
        }

        return graph;
    }

    private void addQueueWhenDegreeZero(Queue<Integer> queue, int[] degree) {
        for (int i = 1; i < degree.length; i++) {
            if (degree[i] == 0) {
                queue.add(i);
            }
        }
    }
}
