package coding_test.y2019.zoom.q1;

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
        assertThat(solution.solution(1, 3, new int[]{0, 1, 2, -2, 3}, new int[]{0, 1, 4, 1, 0}))
                .isEqualTo(2);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(2, 4, new int[]{4, 0, 1, -2}, new int[]{-4, 4, 3, 0}))
                .isEqualTo(1);
    }
}