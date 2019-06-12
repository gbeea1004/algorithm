package baekjoon.q5585;

import java.util.Scanner;

public class Main {
    private static int change;
    private static int countOfMoney;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        change = 1000 - scanner.nextInt();
        countOfMoney = 0;

        changeMoney(500);
        changeMoney(100);
        changeMoney(50);
        changeMoney(10);
        changeMoney(5);
        changeMoney(1);

        System.out.println(countOfMoney);
        scanner.close();
    }

    private static void changeMoney(int money) {
        if (change / money >= 1) {
            int mok = change / money;
            change -= mok * money;
            countOfMoney += mok;
        }
    }
}
