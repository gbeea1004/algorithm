package programmers.q42862;

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
    void testCase_1() {
        assertThat(solution.solution(2, new int[]{1}, new int[]{1})).isEqualTo(2);
    }

    @Test
    void testCase_2() {
        assertThat(solution.solution(5, new int[]{2, 3, 4}, new int[]{3, 4, 5})).isEqualTo(4);
    }

    @Test
    void testCase_3() {
        assertThat(solution.solution(2, new int[]{2}, new int[]{2})).isEqualTo(2);
    }
}