package coding_test.y2019.programmers_job_09_28.q1;

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
        assertThat(solution.solution(new int[]{5, 3, 7}, new int[]{3, 7, 6})).isEqualTo(3);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new int[]{1, 2}, new int[]{2, 3, 1})).isEqualTo(2);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(new int[]{3, 8, 6}, new int[]{5, 6, 4})).isEqualTo(2);
    }

    @Test
    public void testCase_4() {
        assertThat(solution.solution(new int[]{5, 2}, new int[]{1})).isEqualTo(0);
    }
}