package programmers.q12980;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class SolutionTest {
    @Test
    public void testCase_1() {
        Solution solution = new Solution();
        assertThat(solution.solution(5), CoreMatchers.is(2));
    }

    @Test
    public void testCase_2() {
        Solution solution = new Solution();
        assertThat(solution.solution(6), CoreMatchers.is(2));
    }

    @Test
    public void testCase_3() {
        Solution solution = new Solution();
        assertThat(solution.solution(5000), CoreMatchers.is(5));
    }
}