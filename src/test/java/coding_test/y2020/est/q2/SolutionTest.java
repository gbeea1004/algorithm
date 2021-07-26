package coding_test.y2020.est.q2;

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
        assertThat(solution.solution(new int[]{51, 71, 17, 42})).isEqualTo(93);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new int[]{42, 33, 60})).isEqualTo(102);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(new int[]{51, 32, 43})).isEqualTo(-1);
    }
}