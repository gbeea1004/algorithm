package programmers.q12977;

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
        assertThat(solution.solution(new int[]{1, 2, 3, 4})).isEqualTo(1);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(new int[]{1, 2, 7, 6, 4})).isEqualTo(4);
    }
}