package baekjoon.q10797;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limitNo = Integer.parseInt(scanner.nextLine());
        int[] carsNo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int countOfLimitCar = 0;

        for (int carNo : carsNo) {
            if (limitNo == carNo) {
                countOfLimitCar++;
            }
        }
        System.out.println(countOfLimitCar);
    }
}
