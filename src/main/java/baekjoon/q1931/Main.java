package baekjoon.q1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        List<Conference> conferences = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int[] tokens = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            conferences.add(new Conference(tokens[0], tokens[1]));
        }
        System.out.println(Solution.solution(conferences));
    }
}

class Solution {
    public static int solution(List<Conference> conferences) {
        conferences.sort((o1, o2) -> {
            if (o1.getEndTime() == o2.getEndTime()) {
                return o1.getStartTime() - o2.getStartTime();
            }
            return o1.getEndTime() - o2.getEndTime();
        });
        int result = 1;
        int endPoint = conferences.get(0).getEndTime();
        for (int i = 1; i < conferences.size(); i++) {
            Conference conference = conferences.get(i);
            if (conference.getStartTime() >= endPoint) {
                endPoint = conference.getEndTime();
                result++;
            }
        }
        return result;
    }
}

class Conference {
    private int startTime;
    private int endTime;

    public Conference(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
