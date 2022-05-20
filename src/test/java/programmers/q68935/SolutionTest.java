package programmers.q68935;

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
        assertThat(solution.solution(45)).isEqualTo(7);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(125)).isEqualTo(229);
    }
}