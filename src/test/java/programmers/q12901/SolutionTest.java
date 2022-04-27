package programmers.q12901;

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
        assertThat(solution.solution(5, 24)).isEqualTo("TUE");
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(1, 1)).isEqualTo("FRI");
    }
}