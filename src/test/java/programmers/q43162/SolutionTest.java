package programmers.q43162;

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
        assertThat(solution.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}})).isEqualTo(2);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}})).isEqualTo(1);
    }
}