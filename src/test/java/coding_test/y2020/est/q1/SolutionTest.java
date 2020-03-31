package coding_test.y2020.est.q1;

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
        assertThat(solution.solution(new int[]{3, 8, 2, 3, 3, 2})).isEqualTo(3);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new int[]{7, 1, 2, 8, 2})).isEqualTo(2);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(new int[]{3, 1, 4, 1, 5})).isEqualTo(0);
    }

    @Test
    public void testCase_4() {
        assertThat(solution.solution(new int[]{5, 5, 5, 5, 5})).isEqualTo(5);
    }

    @Test
    public void testCase_5() {
        assertThat(solution.solution(new int[]{1, 5, 3, 2})).isEqualTo(1);
    }
}