package baekjoon.q7576;

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
        assertThat(solution.solution(new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1}})).isEqualTo(8);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new int[][]{
                {0, -1, 0, 0, 0, 0},
                {-1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1}})).isEqualTo(-1);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(new int[][]{
                {1, -1, 0, 0, 0, 0},
                {0, -1, 0, 0, 0, 0},
                {0, 0, 0, 0, -1, 0},
                {0, 0, 0, 0, -1, 1}})).isEqualTo(6);
    }

    @Test
    public void testCase_4() {
        assertThat(solution.solution(new int[][]{
                {-1, 1, 0, 0, 0},
                {0, -1, -1, -1, 0},
                {0, -1, -1, -1, 0},
                {0, -1, -1, -1, 0},
                {0, 0, 0, 0, 0}})).isEqualTo(14);
    }

    @Test
    public void testCase_5() {
        assertThat(solution.solution(new int[][]{
                {1, -1},
                {-1, 1}})).isEqualTo(0);
    }
}