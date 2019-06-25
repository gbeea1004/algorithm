package programmers.q42889;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void testCase_1() {
        assertThat(solution.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})).isEqualTo(new int[]{3, 4, 2, 1, 5});
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(4, new int[]{4, 4, 4, 4, 4})).isEqualTo(new int[]{4, 1, 2, 3});
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(2, new int[]{3, 3, 3, 1})).isEqualTo(new int[]{1, 2});
    }
}