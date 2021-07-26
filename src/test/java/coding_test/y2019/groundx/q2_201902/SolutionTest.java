package coding_test.y2019.groundx.q2_201902;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    @Test
    public void testCase_1() {
        Solution solution = new Solution();
        assertThat(solution.solution(3, 5)).isEqualTo(7);
    }

    @Test
    public void testCase_2() {
        Solution solution = new Solution();
        assertThat(solution.solution(2, 5)).isEqualTo(6);
    }

    @Test
    public void testCase_3() {
        Solution solution = new Solution();
        assertThat(solution.solution(3, 3)).isEqualTo(3);
    }

    @Test
    public void testCase_4() {
        Solution solution = new Solution();
        assertThat(solution.solution(4, 5)).isEqualTo(8);
    }

    @Test
    public void testCase_5() {
        Solution solution = new Solution();
        assertThat(solution.solution(2, 7)).isEqualTo(8);
    }
}