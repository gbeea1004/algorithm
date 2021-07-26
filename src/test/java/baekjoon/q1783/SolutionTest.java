package baekjoon.q1783;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    private Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void testCase_1() {
        assertThat(solution.solution(100, 50)).isEqualTo(48);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(1, 1)).isEqualTo(1);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(17, 5)).isEqualTo(4);
    }

    @Test
    public void testCase_4() {
        assertThat(solution.solution(2, 4)).isEqualTo(2);
    }

    @Test
    public void testCase_5() {
        assertThat(solution.solution(20, 4)).isEqualTo(4);
    }
}