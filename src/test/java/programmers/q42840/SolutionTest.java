package programmers.q42840;

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
        assertThat(solution.solution(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{1});
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(new int[]{1, 3, 2, 4, 2})).isEqualTo(new int[]{1, 2, 3});
    }

    @Test
    void testCase3() {
        assertThat(solution.solution(new int[]{2, 1})).isEqualTo(new int[]{2});
    }

    @Test
    void testCase4() {
        assertThat(solution.solution(new int[]{1})).isEqualTo(new int[]{1});
    }

    @Test
    void testCase5() {
        assertThat(solution.solution(new int[]{3, 1})).isEqualTo(new int[]{2, 3});
    }
}
