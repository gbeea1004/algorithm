package coding_test.y2019.eleven.q1;

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
        assertThat(solution.solution(10)).isEqualTo(new int[]{6, 4});
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(14)).isEqualTo(new int[]{5, 8});
    }
}