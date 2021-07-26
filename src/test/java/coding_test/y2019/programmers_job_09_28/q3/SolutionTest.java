package coding_test.y2019.programmers_job_09_28.q3;

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
        assertThat(solution.solution(new int[]{12, 12, 12, 12, 12})).isEqualTo(36);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new int[]{12, 80, 14, 22, 100})).isEqualTo(180);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(new int[]{2, 100, 100, 1, 100, 1})).isEqualTo(202);
    }
}