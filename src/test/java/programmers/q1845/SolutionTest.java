package programmers.q1845;

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
        assertThat(solution.solution(new int[]{3, 1, 2, 3})).isEqualTo(2);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(new int[]{3, 3, 3, 2, 2, 4})).isEqualTo(3);
    }

    @Test
    void testCase3() {
        assertThat(solution.solution(new int[]{3, 3, 3, 2, 2, 2})).isEqualTo(2);
    }
}