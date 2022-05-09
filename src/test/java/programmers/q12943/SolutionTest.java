package programmers.q12943;

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
        assertThat(solution.solution(6)).isEqualTo(8);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(16)).isEqualTo(4);
    }

    @Test
    void testCase3() {
        assertThat(solution.solution(626331)).isEqualTo(-1);
    }
}