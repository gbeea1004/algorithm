package programmers.q250125;

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
        String[][] board = {
                {"blue", "red", "orange", "red"},
                {"red", "red", "blue", "orange"},
                {"blue", "orange", "red", "red"},
                {"orange", "orange", "red", "blue"},
        };
        int h = 1;
        int w = 1;

        // when
        int result = solution.solution(board, h, w);

        // then
        assertThat(result).isEqualTo(2);
    }
}