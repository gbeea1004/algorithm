package programmers.q12985;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void testCase_1() {
        Solution solution = new Solution();
        assertThat(solution.solution(8, 4, 7), CoreMatchers.is(3));
    }

    @Test
    public void testCase_2() {
        Solution solution = new Solution();
        assertThat(solution.solution(4, 1, 4), CoreMatchers.is(2));
    }
}