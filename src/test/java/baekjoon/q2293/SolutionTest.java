package baekjoon.q2293;


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
        assertThat(solution.solution(new int[]{1, 2}, 1)).isEqualTo(1);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new int[]{1, 2, 5}, 10)).isEqualTo(10);
    }
}