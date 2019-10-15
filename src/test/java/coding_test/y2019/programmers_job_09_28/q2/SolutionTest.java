package coding_test.y2019.programmers_job_09_28.q2;

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
        assertThat(solution.solution(new String[]{"D5"})).isEqualTo(50);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new String[]{"D5", "E8", "G2"})).isEqualTo(42);
    }
}