package coding_test.y2020.est.q3;

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
        assertThat(solution.solution(new int[]{3, 4, 5, 3, 7})).isEqualTo(3);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new int[]{1, 2, 3, 4})).isEqualTo(-1);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(new int[]{1, 3, 1, 2})).isEqualTo(0);
    }
}