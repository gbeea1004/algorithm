package baekjoon.q1932;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[][] triangle = new int[count][count];
        for (int i = 0; i < count; i++) {
            int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < input.length; j++) {
                triangle[i][j] = input[j];
            }
        }

//        for (int[] ints : triangle) {
//            for (int anInt : ints) {
//                System.out.print(anInt);
//            }
//            System.out.println();
//        }

        int floor = 2;
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < floor; j++) {
                triangle[i + 1][j] += triangle[i][j];
            }
            floor++;
        }

        bw.flush();
    }
}
