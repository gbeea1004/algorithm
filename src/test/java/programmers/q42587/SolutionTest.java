package programmers.q42587;

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
        assertThat(solution.solution(new int[]{2, 1, 3, 2}, 2)).isEqualTo(1);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(new int[]{1, 1, 9, 1, 1, 1}, 0)).isEqualTo(5);
    }
}