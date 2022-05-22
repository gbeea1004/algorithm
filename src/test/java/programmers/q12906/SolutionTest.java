package programmers.q12906;

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
        assertThat(solution.solution(new int[]{1, 1, 3, 3, 0, 1, 1})).isEqualTo(new int[]{1, 3, 0, 1});
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(new int[]{4, 4, 4, 3, 3})).isEqualTo(new int[]{4, 3});
    }
}