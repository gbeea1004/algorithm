package baekjoon.q14719;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testCase_1() {
        assertThat(solution.solution(new int[]{3, 0, 1, 4})).isEqualTo(5);
    }

    @Test
    void testCase_2() {
        assertThat(solution.solution(new int[]{3, 1, 2, 3, 4, 1, 1, 2})).isEqualTo(5);
    }

    @Test
    void testCase_3() {
        assertThat(solution.solution(new int[]{0, 0, 0, 2, 0})).isEqualTo(0);
    }
}