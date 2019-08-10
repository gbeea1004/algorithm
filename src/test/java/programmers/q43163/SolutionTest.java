package programmers.q43163;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void testCase_1() {
        assertThat(solution.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"}), is(4));
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"}), is(0));
    }
}