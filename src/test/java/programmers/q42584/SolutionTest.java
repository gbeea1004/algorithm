package programmers.q42584;

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
        // given
        int[] prices = {1, 2, 3, 2, 3};

        // when
        int[] result = solution.solution(prices);

        // then
        assertThat(result).isEqualTo(new int[]{4, 3, 1, 1, 0});
    }
}