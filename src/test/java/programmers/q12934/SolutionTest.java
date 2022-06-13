package programmers.q12934;

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
        assertThat(solution.solution(121)).isEqualTo(144);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(3)).isEqualTo(-1);
    }
}