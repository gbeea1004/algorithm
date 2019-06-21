package programmers.q42888;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void testCase_1() {
        assertThat(solution.solution(new String[]{
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"}))
                .isEqualTo(new String[]{
                        "Prodo님이 들어왔습니다.",
                        "Ryan님이 들어왔습니다.",
                        "Prodo님이 나갔습니다.",
                        "Prodo님이 들어왔습니다."});
    }
}