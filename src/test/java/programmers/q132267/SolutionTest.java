package programmers.q132267;

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
        assertThat(solution.solution(3, 1, 20)).isEqualTo(9);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(3, 2, 20)).isEqualTo(36);
    }

    @Test
    void testCase3() {
        assertThat(solution.solution(3, 2, 10)).isEqualTo(16);
        // 10 - 9 + 6 =
    }

    @Test
    void testCase4() {
        assertThat(solution.solution(2, 1, 20)).isEqualTo(19);
    }
}