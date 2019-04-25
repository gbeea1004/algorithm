package baekjoon.q1924;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] date = br.readLine().split(" ");
        int[] maxDates = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int month = Integer.parseInt(date[0]);
        int sumDate = 0;
        for (int i = 0; i < month - 1; i++) {
            sumDate += maxDates[i];
        }
        sumDate += Integer.parseInt(date[1]);
        sumDate %= 7;

        bw.write(day[sumDate]);
        bw.flush();
    }
}
