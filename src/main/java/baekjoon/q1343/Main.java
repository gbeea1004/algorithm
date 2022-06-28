package baekjoon.q1343;

import java.util.Scanner;

public class Main {

    private static final String FOUR_WORD = "AAAA";
    private static final String TWO_WORD = "BB";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        text = text.replaceAll("XXXX", FOUR_WORD);
        text = text.replaceAll("XX", TWO_WORD);

        if (text.contains("X")) {
            System.out.println("-1");
        } else {
            System.out.println(text);
        }

        scanner.close();
    }
}
