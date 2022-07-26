package programmers.q12915;

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
        assertThat(solution.solution(new String[]{"abce", "abcd", "cdx" }, 2)).isEqualTo(new String[]{"abcd", "abce", "cdx" });
    }
}