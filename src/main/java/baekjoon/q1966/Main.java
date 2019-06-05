package baekjoon.q1966;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            int[] no = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int findNo = no[1];
            int[] printPriority = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            LinkedList<Integer> queue = new LinkedList<>();
            int result = 0;

            for (int print : printPriority) {
                queue.add(print);
            }

            while (!queue.isEmpty()) {
                boolean isPriority = true;
                for (int j = 1; j < queue.size(); j++) {
                    if (queue.peek() < queue.get(j)) {
                        isPriority = false;
                        break;
                    }
                }

                if (isPriority) {
                    result++;
                    queue.poll();
                    if (findNo == 0) {
                        break;
                    }
                    findNo--;
                } else {
                    queue.add(queue.poll());
                    if (findNo == 0) {
                        findNo = queue.size() - 1;
                    } else {
                        findNo--;
                    }
                }
            }
            bw.write(String.valueOf(result));
            bw.newLine();
        }

        bw.flush();
    }
}
