package baekjoon.q1946;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            int applicantCount = Integer.parseInt(br.readLine());
            List<employer> employers = new ArrayList<>();
            for (int j = 0; j < applicantCount; j++) {
                int[] tokens = Arrays.stream(br.readLine().split(" "))
                                     .mapToInt(Integer::parseInt)
                                     .toArray();
                employers.add(new employer(tokens[0], tokens[1]));
            }
            bw.write(String.valueOf(Solution.solution(employers)));
            bw.newLine();
        }
        bw.flush();
    }
}

class Solution {
    public static int solution(List<employer> employers) {
        employers.sort(Comparator.comparingInt(employer::getDocumentRank));
        int maxPersonCount = 1;
        int standardInterviewRank = employers.get(0).getInterviewRank();
        for (int i = 1; i < employers.size(); i++) {
            employer employer = employers.get(i);
            if (employer.isHigherThanInterviewRank(standardInterviewRank)) {
                maxPersonCount++;
                standardInterviewRank = employer.getInterviewRank();
            }
        }
        return maxPersonCount;
    }
}

class employer {
    private int documentRank;
    private int interviewRank;

    public employer(int documentRank, int interviewRank) {
        this.documentRank = documentRank;
        this.interviewRank = interviewRank;
    }

    public boolean isHigherThanInterviewRank(int standardInterviewRank) {
        return interviewRank < standardInterviewRank;
    }

    public int getDocumentRank() {
        return documentRank;
    }

    public int getInterviewRank() {
        return interviewRank;
    }
}
