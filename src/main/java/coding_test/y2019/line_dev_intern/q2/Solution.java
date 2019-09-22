package coding_test.y2019.line_dev_intern.q2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] no = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int findOrder = sc.nextInt();
        System.out.println(solution(no, findOrder));
    }

    public static String solution(int[] no, int findOrder) {
        StringBuilder findNo = new StringBuilder();

        if (no[0] == 0) {
            findNo.append("0");
            return findNo.toString();
        }


        return findNo.toString();
    }
}
