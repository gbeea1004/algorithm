package coding_test.tmon.view;

import java.util.Scanner;

public class InputView {

    public static int measurementTime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("측정 시간: ");
        return Integer.parseInt(sc.nextLine()) * 60; // 분 으로 변경
    }

    public static int countOfCook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("요리사: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static int countOfCleaningStaff() {
        Scanner sc = new Scanner(System.in);
        System.out.print("청소 스탭: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static int countOfTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("테이블: ");
        return Integer.parseInt(sc.nextLine());
    }
}
