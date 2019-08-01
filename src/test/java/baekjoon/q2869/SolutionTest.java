package baekjoon.q2869;


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
        assertThat(solution.solution(2, 1, 5)).isEqualTo(4);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(2, 1, 2)).isEqualTo(1);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(3, 1, 5)).isEqualTo(2);
    }
}