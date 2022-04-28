package programmers.q12926;

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
        assertThat(solution.solution("AB", 1)).isEqualTo("BC");
    }

    @Test
    void testCase2() {
        assertThat(solution.solution("z", 1)).isEqualTo("a");
    }

    @Test
    void testCase3() {
        assertThat(solution.solution("a B z", 4)).isEqualTo("e F d");
    }
}