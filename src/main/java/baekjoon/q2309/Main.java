package baekjoon.q2309;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> heightOfMicronesians = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            heightOfMicronesians.add(scanner.nextInt());
            sum += heightOfMicronesians.get(i);
        }
        Collections.sort(heightOfMicronesians);

        int findNo = sum - 100;
        removeFaker(heightOfMicronesians, findNo);

        for (Integer heightOfMicronesian : heightOfMicronesians) {
            System.out.println(heightOfMicronesian);
        }
    }

    private static void removeFaker(List<Integer> heightOfMicronesians, int findNo) {
        for (int i = 0; i < heightOfMicronesians.size() - 1; i++) {
            int no = heightOfMicronesians.get(i);
            for (int j = i + 1; j < heightOfMicronesians.size(); j++) {
                if (no + heightOfMicronesians.get(j) == findNo) {
                    heightOfMicronesians.remove(j);
                    heightOfMicronesians.remove(i);
                    break;
                }
            }
        }
    }
}
