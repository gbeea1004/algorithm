package baekjoon.q9237;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] treeTimes = Arrays.stream(br.readLine().split(" "))
                                    .mapToInt(Integer::parseInt)
                                    .boxed()
                                    .toArray(Integer[]::new);

        System.out.println(new Solution().solution(treeTimes));

        br.close();
    }
}

class Solution {

    public int solution(Integer[] treeTimes) {
        Arrays.sort(treeTimes, Collections.reverseOrder());
        int currentTime = 1;
        int result = 0;

        for (Integer treeTime : treeTimes) {
            currentTime++;
            result = Math.max(result, currentTime + treeTime);
        }

        return result;
    }
}
