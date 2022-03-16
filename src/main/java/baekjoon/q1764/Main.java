package baekjoon.q1764;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] personCounts = Arrays.stream(br.readLine()
                                             .split(" "))
                                   .mapToInt(Integer::parseInt)
                                   .toArray();
        Set<String> aNames = new HashSet<>();
        for (int i = 0; i < personCounts[0]; i++) {
            aNames.add(br.readLine());
        }
        String[] bNames = new String[personCounts[1]];
        for (int i = 0; i < bNames.length; i++) {
            bNames[i] = br.readLine();
        }

        List<String> result = new Solution().solution(aNames, bNames);
        bw.write(String.valueOf(result.size()));
        bw.newLine();
        for (String name : result) {
            bw.write(name);
            bw.newLine();
        }

        bw.flush();

        bw.close();
        br.close();
    }
}

class Solution {

    public List<String> solution(Set<String> aNames, String[] bNames) {
        return Arrays.stream(bNames)
                     .filter(aNames::contains) // HashSet 의 contains 시간복잡도는 O(1)
                     .sorted()
                     .collect(Collectors.toList());
    }
}
