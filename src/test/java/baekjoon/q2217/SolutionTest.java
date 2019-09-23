package baekjoon.q2217;

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
        assertThat(solution.solution(new int[]{10, 15})).isEqualTo(20);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new int[]{10})).isEqualTo(10);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(new int[]{10, 5, 5})).isEqualTo(15);
    }
}