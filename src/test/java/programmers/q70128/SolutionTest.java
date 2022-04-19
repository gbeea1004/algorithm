package programmers.q70128;

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
        assertThat(solution.solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2})).isEqualTo(3);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(new int[]{-1, 0, 1}, new int[]{1, 0, -1})).isEqualTo(-2);
    }
}