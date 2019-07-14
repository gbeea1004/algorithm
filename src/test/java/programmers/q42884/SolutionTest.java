package programmers.q42884;


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
        assertThat(solution.solution(new int[][]{{-20, 15}, {-14, -5}, {-18, -13}, {-5, -3}})).isEqualTo(2);
    }
}