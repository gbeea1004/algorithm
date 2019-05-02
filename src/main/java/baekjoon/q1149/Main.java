package baekjoon.q1149;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[][] houses = new int[count][3]; // 빨강, 초록, 파랑 고정
        for (int i = 0; i < houses.length; i++) {
            int[] values = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < houses[0].length; j++) {
                houses[i][j] = values[j];
            }
        }

        for (int i = 1; i < houses.length; i++) {
            houses[i][0] += Math.min(houses[i - 1][1], houses[i - 1][2]);
            houses[i][1] += Math.min(houses[i - 1][0], houses[i - 1][2]);
            houses[i][2] += Math.min(houses[i - 1][0], houses[i - 1][1]);
        }

        int houseCount = houses.length - 1;
        bw.write(String.valueOf(Math.min(houses[houseCount][0], Math.min(houses[houseCount][1], houses[houseCount][2]))));
        bw.flush();
    }
}
