package programmers.q42842;

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
        assertThat(solution.solution(10, 2)).isEqualTo(new int[]{4, 3});
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(8, 1)).isEqualTo(new int[]{3, 3});
    }

    @Test
    void testCase3() {
        assertThat(solution.solution(24, 24)).isEqualTo(new int[]{8, 6});
    }
}