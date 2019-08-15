package baekjoon.q2468;

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
        assertThat(solution.solution(new int[][]{
                {6, 8, 2, 6, 2},
                {3, 2, 3, 4, 6},
                {6, 7, 3, 3, 2},
                {7, 2, 5, 3, 6},
                {8, 9, 5, 2, 7}})).isEqualTo(5);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new int[][]{
                {1, 1},
                {1, 1}})).isEqualTo(1);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(new int[][]{
                {2, 2},
                {2, 2}})).isEqualTo(1);
    }
}