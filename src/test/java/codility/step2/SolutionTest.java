package codility.step2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    public void testCase_1() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{9, 3, 9, 3, 9, 7, 9})).isEqualTo(7);
    }

    @Test
    public void testCase_2() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{1, 2, 1, 1, 2, 1, 1, 2, 5})).isEqualTo(5);
    }

    @Test
    public void testCase_3() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{1, 5, 5, 1, 5, 5, 1, 3, 5})).isEqualTo(3);
    }
}