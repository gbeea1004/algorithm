package coding_test.groundx.day_20190521.q1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    public void testCase_1() {
        Solution solution = new Solution();
        int[] v = new int[]{0, 1, 1, 0, 1, 1, 1, 0};
        assertThat(solution.solution(v)).isEqualTo(46);
    }
}