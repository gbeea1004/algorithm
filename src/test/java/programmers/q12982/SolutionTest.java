package programmers.q12982;

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
        assertThat(solution.solution(new int[]{1, 3, 2, 5, 4}, 9)).isEqualTo(3);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(new int[]{2, 2, 3, 3}, 10)).isEqualTo(4);
    }
}