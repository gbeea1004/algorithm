package programmers.q42840;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] answers) {
        final int[] personA = {1, 2, 3, 4, 5};
        final int[] personB = {2, 1, 2, 3, 2, 4, 2, 5};
        final int[] personC = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        final int PERSON_A_ID = 1;
        final int PERSON_B_ID = 2;
        final int PERSON_C_ID = 3;

        int answerCountOfPersonA = 0;
        int answerCountOfPersonB = 0;
        int answerCountOfPersonC = 0;

        for (int i = 0; i < answers.length; i++) {
            if (isRightAnswer(personA, answers, i)) {
                answerCountOfPersonA++;
            }
            if (isRightAnswer(personB, answers, i)) {
                answerCountOfPersonB++;
            }
            if (isRightAnswer(personC, answers, i)) {
                answerCountOfPersonC++;
            }
        }

        int maxScore = Math.max(answerCountOfPersonC, Math.max(answerCountOfPersonA, answerCountOfPersonB));

        List<Integer> result = new ArrayList<>();
        if (maxScore == answerCountOfPersonA) {
            result.add(PERSON_A_ID);
        }
        if (maxScore == answerCountOfPersonB) {
            result.add(PERSON_B_ID);
        }
        if (maxScore == answerCountOfPersonC) {
            result.add(PERSON_C_ID);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean isRightAnswer(int[] person, int[] answers, int index) {
        return person[index % person.length] == answers[index];
    }
}
