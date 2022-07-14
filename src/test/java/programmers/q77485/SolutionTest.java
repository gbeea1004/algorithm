package programmers.q77485;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testCase1() {
        int[][] queries = new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}};
        assertThat(solution.solution(6, 6, queries)).isEqualTo(new int[]{8, 10, 25});
    }

    @Test
    void testCase2() {
        int[][] queries = new int[][]{{1, 1, 2, 2}, {1, 2, 2, 3}, {2, 1, 3, 2}, {2, 2, 3, 3}};
        assertThat(solution.solution(3, 3, queries)).isEqualTo(new int[]{1, 1, 5, 3});
    }

    @Test
    void testCase3() {
        int[][] queries = new int[][]{{1, 1, 100, 97}};
        assertThat(solution.solution(100, 97, queries)).isEqualTo(new int[]{1});
    }
}