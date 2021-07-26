package coding_test.y2019.groundx.day_20190521.q1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    @Test
    public void testCase_1() {
        Solution solution = new Solution();
        int[] v = new int[]{0, 1, 1, 0, 1, 1, 1, 0};
        assertThat(solution.solution(v)).isEqualTo(46);
    }
}