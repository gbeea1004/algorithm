package baekjoon.q19944;

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
        assertThat(solution.solution(3, 1)).isEqualTo("NEWBIE!");
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(3, 5)).isEqualTo("TLE!");
    }

    @Test
    void testCase3() {
        assertThat(solution.solution(3, 3)).isEqualTo("OLDBIE!");
    }
}