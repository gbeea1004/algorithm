package programmers.q42841;


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
        assertThat(solution.solution(new int[][]{{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}}))
                .isEqualTo(2);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new int[][]{{123, 3, 0}}))
                .isEqualTo(1);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(new int[][]{{123, 2, 0}}))
                .isEqualTo(18);
    }

    @Test
    public void testCase_4() {
        assertThat(solution.solution(new int[][]{{123, 2, 0}, {345, 0, 0}}))
                .isEqualTo(4);
    }

    @Test
    public void testCase_5() {
        assertThat(solution.solution(new int[][]{{987, 2, 0}, {123, 1, 0}}))
                .isEqualTo(3);
    }
}