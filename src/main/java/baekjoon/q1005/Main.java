package baekjoon.q1005;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/*
* [위상정렬]이용
* 같은 위상에 있는 노드들을 기준으로 정렬
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int playCount = Integer.parseInt(br.readLine());
        int[] result = new int[playCount];
        for (int i = 0; i < playCount; i++) {
            int[] buildingNo = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] buildCost = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Map<Integer, RuleNo> rule = new HashMap<>();
            for (int j = 0; j < buildingNo[1]; j++) {
                int[] aToB = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                if (rule.get(aToB[1]) == null) {
                    rule.put(aToB[1], new RuleNo(aToB[0]));
                } else {
                    rule.put(aToB[1], rule.get(aToB[1]).addNo(aToB[0]));
                }
            }
            int findNo = Integer.parseInt(br.readLine());
            int totalCost = buildCost[findNo - 1];
            while (true) {
                if (rule.get(findNo) == null) {
                    break;
                }
                List<Integer> findByBuildingNo = rule.get(findNo).getNo();
                int maxKey = 0;
                for (int j = 1; j < findByBuildingNo.size(); j++) {
                    int key = findByBuildingNo.get(j);
                    if (buildCost[--key] > buildCost[maxKey]) {
                        maxKey = key;
                    }
                }
                totalCost += buildCost[maxKey];
                findNo = maxKey;
            }
            result[i] = totalCost;
        }
        for (int i : result) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        bw.flush();
    }
}

class RuleNo {
    private List<Integer> no = new ArrayList<>();

    public RuleNo(int no) {
        this.no.add(no);
    }

    public RuleNo addNo(int no) {
        this.no.add(no);
        return this;
    }

    public List<Integer> getNo() {
        return no;
    }
}
