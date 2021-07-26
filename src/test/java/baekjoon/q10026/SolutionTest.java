package baekjoon.q10026;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void testCase_1() {
        assertThat(solution.solution(new String[][]{
                {"R", "R", "R", "B", "B"},
                {"G", "G", "B", "B", "B"},
                {"B", "B", "B", "R", "R"},
                {"B", "B", "R", "R", "R"},
                {"R", "R", "R", "R", "R"}})).isEqualTo("4 3");
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new String[][]{
                {"R", "R", "B", "B"},
                {"G", "G", "B", "B"},
                {"B", "B", "B", "B"},
                {"R", "R", "R", "B"}})).isEqualTo("4 3");
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(new String[][]{
                {"R", "G"},
                {"B", "R"}})).isEqualTo("4 2");
    }
}