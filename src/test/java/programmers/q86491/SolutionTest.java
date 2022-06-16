package programmers.q86491;

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
        int[][] sizes = new int[][]{
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}
        };

        assertThat(solution.solution(sizes)).isEqualTo(4000);
    }
}