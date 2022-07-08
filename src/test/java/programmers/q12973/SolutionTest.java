package programmers.q12973;

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
        assertThat(solution.solution("baabaa")).isEqualTo(1);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution("cdcd")).isEqualTo(0);
    }
}