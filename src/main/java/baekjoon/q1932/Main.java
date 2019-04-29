package baekjoon.q1932;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[][] triangle = new int[count][count];
        int[][] copyTriangle = new int[count][count];

        for (int i = 0; i < count; i++) {
            int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = input[j];
            }
        }

        // 삼각형 양 끝의 경우의 수는 1
        copyTriangle[0][0] = triangle[0][0]; // 맨 꼭대기
        for (int i = 1; i < count; i++) {
            copyTriangle[i][0] = copyTriangle[i - 1][0] + triangle[i][0];
            copyTriangle[i][i] = copyTriangle[i - 1][i - 1] + triangle[i][i];
        }

//        System.out.println("---- step 1 ----");
//        for (int[] ints : copyTriangle) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        // 비어있는 값 dp로 계산
        for (int i = 2; i < count; i++) {
            for (int j = 1; j < i; j++) {
                copyTriangle[i][j] = Math.max(copyTriangle[i - 1][j - 1], copyTriangle[i - 1][j]) + triangle[i][j];
            }
        }

//        System.out.println("---- step 2 ----");
//        for (int[] ints : copyTriangle) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        // 맨 마지막 값 중 최대값이 정답
        int max = copyTriangle[count - 1][count - 1];
        for (int i = 1; i < count; i++) {
            if (max < copyTriangle[count - 1][i]) {
                max = copyTriangle[count - 1][i];
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
    }
}
