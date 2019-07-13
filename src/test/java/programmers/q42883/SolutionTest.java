package programmers.q42883;


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
        assertThat(solution.solution("1924", 2)).isEqualTo("94");
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution("1231234", 3)).isEqualTo("3234");
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution("4177252841", 4)).isEqualTo("775841");
    }
}