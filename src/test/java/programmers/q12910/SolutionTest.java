package programmers.q12910;

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
        assertThat(solution.solution(new int[]{5, 9, 7, 10}, 5)).isEqualTo(new int[]{5, 10});
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(new int[]{2, 36, 1, 3}, 1)).isEqualTo(new int[]{1, 2, 3, 36});
    }

    @Test
    void testCase3() {
        assertThat(solution.solution(new int[]{3, 2, 6}, 10)).isEqualTo(new int[]{-1});
    }
}