package coding_test.y2019.line_dev_intern.q3;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfPerson = sc.nextInt();
        int[][] people = new int[countOfPerson][2];
        for (int i = 0; i < people.length; i++) {
            people[i][0] = sc.nextInt();
            people[i][1] = sc.nextInt();
        }
        Arrays.sort(people, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        System.out.println(solution(people));
    }

    public static int solution(int[][] people) {
        int countOfToilet = 0;

        return countOfToilet;
    }
}