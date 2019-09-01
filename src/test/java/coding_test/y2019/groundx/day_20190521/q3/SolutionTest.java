package coding_test.y2019.groundx.day_20190521.q3;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    public void testCase_1() {
        Solution solution = new Solution();
        String[] board = {".o.", ".ox", "x.."};
        assertThat(solution.solution(board)).isEqualTo("D");
    }

    @Test
    public void testCase_2() {
        Solution solution = new Solution();
        String[] board = {"oo.", ".x.", "oxx"};
        assertThat(solution.solution(board)).isEqualTo("O");
    }
}