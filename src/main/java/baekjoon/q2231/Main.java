package baekjoon.q2231;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(Solution.solution(scanner.nextInt()));
    }
}

class Solution {
    public static int solution(int no) {
        int smallestNo = 1;
        while (smallestNo < no) {
            int resultNo = smallestNo;
            String noToStr = String.valueOf(smallestNo);
            for (int i = 0; i < noToStr.length(); i++) {
                resultNo += noToStr.charAt(i) - '0';
            }
            if (resultNo == no) {
                return Integer.parseInt(noToStr);
            }
            smallestNo++;
        }
        return 0;
    }
}
