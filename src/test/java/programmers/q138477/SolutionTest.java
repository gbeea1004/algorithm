package programmers.q138477;

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
        assertThat(solution.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200}))
                .isEqualTo(new int[]{10, 10, 10, 20, 20, 100, 100});
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}))
                .isEqualTo(new int[]{0, 0, 0, 0, 20, 40, 70, 70, 150, 300});
    }
}