package coding_test.y2019.zoom.q2;

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
        assertThat(solution.solution(new int[]{1, 1, 2}, new int[]{3, 2, 3})).isEqualTo(1);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new int[]{1, 1, 1}, new int[]{2, 2, 2})).isEqualTo(3);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(new int[]{1, 2, 3, 1, 2, 12, 8, 4}, new int[]{5, 10, 15, 2, 4, 15, 10, 5})).isEqualTo(10);
    }
}