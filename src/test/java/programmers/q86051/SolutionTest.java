package programmers.q86051;

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
        assertThat(solution.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0})).isEqualTo(14);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(new int[]{5,8,4,0,6,7,9})).isEqualTo(6);
    }
}