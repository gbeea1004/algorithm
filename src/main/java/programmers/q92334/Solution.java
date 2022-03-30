package programmers.q92334;

import java.util.*;

public class Solution {

    public int[] solution(String[] id_list, String[] report, int k) {
        // 신고자
        Map<String, ArrayList<String>> reporter = new LinkedHashMap<>();
        for (String id : id_list) {
            reporter.put(id, new ArrayList<>());
        }
        // 신고 당한 횟수
        Map<String, Integer> reportedCount = new LinkedHashMap<>();
        for (String id : id_list) {
            reportedCount.put(id, 0);
        }

        for (String namesText : new HashSet<>(Arrays.asList(report))) {
            String[] names = namesText.split(" ");
            reporter.get(names[0]).add(names[1]);
            reportedCount.put(names[1], reportedCount.get(names[1]) + 1);
        }

        // 이용 정지된 유저
        List<String> suspensionUsers = new ArrayList<>();
        for (String key : reportedCount.keySet()) {
            if (reportedCount.get(key) >= k) {
                suspensionUsers.add(key);
            }
        }

        List<Integer> answer = new ArrayList<>();
        for (String key : reporter.keySet()) {
            int mailCount = 0;
            ArrayList<String> reportedUsers = reporter.get(key);
            for (String reportedUser : reportedUsers) {
                if (suspensionUsers.contains(reportedUser)) {
                    mailCount++;
                }
            }
            answer.add(mailCount);
        }
        int[] result = new int[answer.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}
