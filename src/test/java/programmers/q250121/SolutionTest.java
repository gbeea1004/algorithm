package programmers.q250121;

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
        int[][] data = {
                {1, 20300104, 100, 80},
                {2, 20300804, 847, 37},
                {3, 20300401, 10, 8},
        };
        String ext = "date";
        int valExt = 20300501;
        String sortBy = "remain";

        // when
        int[][] result = solution.solution(data, ext, valExt, sortBy);

        // then
        assertThat(result).isEqualTo(new int[][]{{3, 20300401, 10, 8}, {1, 20300104, 100, 80}});
    }
}