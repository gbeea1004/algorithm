package baekjoon.q17219;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] inputCount = Arrays.stream(br.readLine().split(" "))
                                 .mapToInt(Integer::parseInt)
                                 .toArray();
        Solution solution = new Solution();
        for (int i = 0; i < inputCount[0]; i++) {
            String[] siteInfo = br.readLine().split(" ");
            solution.addSiteInfo(siteInfo[0], siteInfo[1]);
        }

        for (int i = 0; i < inputCount[1]; i++) {
            String siteUrl = br.readLine();
            bw.write(solution.solution(siteUrl));
            bw.newLine();
        }

        bw.flush();

        bw.close();
        br.close();
    }
}

class Solution {

    private Map<String, String> map = new HashMap<>();

    public void addSiteInfo(String url, String password) {
        map.put(url, password);
    }

    public String solution(String url) {
        return map.get(url);
    }
}
