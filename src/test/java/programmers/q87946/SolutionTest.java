package programmers.q87946;

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
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        // when
        int result = solution.solution(k, dungeons);

        // then
        assertThat(result).isEqualTo(3);
    }
}