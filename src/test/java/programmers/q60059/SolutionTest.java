package programmers.q60059;

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
        int[][] key = new int[][]{{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
        int[][] lock = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

        assertThat(solution.solution(key, lock)).isEqualTo(true);
    }
}