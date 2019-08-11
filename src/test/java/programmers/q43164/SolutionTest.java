package programmers.q43164;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void testCase_1() {
        assertThat(solution.solution(new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}}),
                is(new String[]{"ICN", "JFK", "HND", "IAD"}));
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new String[][]{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}}),
                is(new String[]{"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"}));
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(new String[][]{{"ICN", "COO"}, {"ICN", "BOO"}, {"COO", "ICN"}}),
                is(new String[]{"ICN", "COO", "ICN", "BOO"}));
    }
}