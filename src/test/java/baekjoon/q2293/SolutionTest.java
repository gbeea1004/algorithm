package baekjoon.q2293;


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
        assertThat(solution.solution(new int[]{1, 2}, 1)).isEqualTo(1);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new int[]{1, 2, 5}, 10)).isEqualTo(10);
    }
}