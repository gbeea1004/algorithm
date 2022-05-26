package programmers.q62048;

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
        assertThat(solution.solution(8, 12)).isEqualTo(80);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(2, 2)).isEqualTo(2);
    }

    @Test
    void testCase3() {
        assertThat(solution.solution(2, 1)).isEqualTo(0);
    }

    @Test
    void testCase4() {
        assertThat(solution.solution(1, 2)).isEqualTo(0);
    }
}