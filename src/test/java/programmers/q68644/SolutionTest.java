package programmers.q68644;

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
        assertThat(solution.solution(new int[]{2, 1, 3, 4, 1})).isEqualTo(new int[]{2, 3, 4, 5, 6, 7});
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(new int[]{5, 0, 2, 7})).isEqualTo(new int[]{2, 5, 7, 9, 12});
    }
}