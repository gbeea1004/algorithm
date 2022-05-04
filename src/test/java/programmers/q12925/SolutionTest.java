package programmers.q12925;

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
        assertThat(solution.solution("1234")).isEqualTo(1234);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution("+1234")).isEqualTo(1234);
    }

    @Test
    void testCase3() {
        assertThat(solution.solution("-1234")).isEqualTo(-1234);
    }
}